package com.mycompany.mavenproject1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.Random;

public class ColaMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simulación de Cola");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500); // Aumentar el tamaño de la ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Área de salida con scroll
        JTextArea areaSalida = new JTextArea(10, 30);
        areaSalida.setEditable(false);
        areaSalida.setFont(new Font("Monospaced", Font.PLAIN, 16)); // Aumentar tamaño de texto
        areaSalida.setForeground(Color.BLACK); // Color del texto
        JScrollPane scroll = new JScrollPane(areaSalida);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Campo para ingresar el tamaño de la cola
        JTextField campoTamaño = new JTextField(5);
        JLabel labelTamaño = new JLabel("Tamaño de la cola:");
        labelTamaño.setFont(new Font("Arial", Font.BOLD, 14)); // Aumentar tamaño de fuente

        // Campo para ingresar elementos
        JTextField campoElemento = new JTextField(5);
        JLabel labelElemento = new JLabel("Elemento:");
        labelElemento.setFont(new Font("Arial", Font.BOLD, 14)); // Aumentar tamaño de fuente

        // Botones de control
        JButton botonEnqueue = new JButton("Agregar (enqueue)");
        JButton botonDequeue = new JButton("Eliminar (dequeue)");
        JButton botonPeek = new JButton("Ver frente (peek)");
        JButton botonVaciar = new JButton("Vaciar cola");
        JButton botonContar = new JButton("Contar elementos");
        JButton botonEsFull = new JButton("¿Es cola llena?");
        JButton botonLlenarAleatorio = new JButton("Llenar automáticamente");
        JButton botonLimpiar = new JButton("Limpiar salida");
        JButton botonMostrarCapacidad = new JButton("Mostrar capacidad");
        JButton botonVerElementos = new JButton("Ver elementos"); // Nuevo botón

        // Cambiar el tamaño de fuente de los botones
        botonEnqueue.setFont(new Font("Arial", Font.PLAIN, 14));
        botonDequeue.setFont(new Font("Arial", Font.PLAIN, 14));
        botonPeek.setFont(new Font("Arial", Font.PLAIN, 14));
        botonVaciar.setFont(new Font("Arial", Font.PLAIN, 14));
        botonContar.setFont(new Font("Arial", Font.PLAIN, 14));
        botonEsFull.setFont(new Font("Arial", Font.PLAIN, 14));
        botonLlenarAleatorio.setFont(new Font("Arial", Font.PLAIN, 14));
        botonLimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
        botonMostrarCapacidad.setFont(new Font("Arial", Font.PLAIN, 14));
        botonVerElementos.setFont(new Font("Arial", Font.PLAIN, 14)); // Tamaño para el nuevo botón

        // Panel para los controles de la cola
        JPanel panelControles = new JPanel(new GridLayout(7, 2, 10, 10)); // Aumentar filas para el nuevo botón
        panelControles.add(labelTamaño);
        panelControles.add(campoTamaño);
        panelControles.add(labelElemento);
        panelControles.add(campoElemento);
        panelControles.add(botonEnqueue);
        panelControles.add(botonDequeue);
        panelControles.add(botonPeek);
        panelControles.add(botonVaciar);
        panelControles.add(botonContar);
        panelControles.add(botonEsFull);
        panelControles.add(botonLlenarAleatorio);
        panelControles.add(botonLimpiar);
        panelControles.add(botonMostrarCapacidad);
        panelControles.add(botonVerElementos); // Agregar nuevo botón al panel

        // Añadir todo al panel principal
        panel.add(scroll, BorderLayout.CENTER);
        panel.add(panelControles, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);

        // Acción cuando se define el tamaño de la cola
        final ColaClass[] cola = new ColaClass[1]; // Array para crear la cola dinámicamente

        campoTamaño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tamaño = Integer.parseInt(campoTamaño.getText());
                cola[0] = new ColaClass(tamaño); // Inicializar la cola
                areaSalida.append("📏 Cola creada con tamaño: " + tamaño + "\n");
            }
        });

        // Acción para agregar (enqueue)
        botonEnqueue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    try {
                        int elemento = Integer.parseInt(campoElemento.getText());
                        cola[0].enqueue(elemento, areaSalida);
                        campoElemento.setText(""); // Limpiar el campo de texto tras agregar el elemento
                    } catch (NumberFormatException ex) {
                        areaSalida.append("⚠️ Por favor ingresa un número válido.\n");
                    }
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para eliminar (dequeue)
        botonDequeue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    cola[0].dequeue(areaSalida);
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para ver el elemento en la parte frontal (peek)
        botonPeek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    try {
                        int frente = cola[0].peek();
                        areaSalida.append("🔍 El elemento en la parte frontal es: " + frente + "\n");
                    } catch (IllegalStateException ex) {
                        areaSalida.append("🚫 La cola está vacía.\n");
                    }
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para vaciar la cola
        botonVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    cola[0].vaciar(areaSalida);
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para contar elementos en la cola
        botonContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    int conteo = cola[0].contarElementos();
                    areaSalida.append("🔢 Hay " + conteo + " elementos en la cola.\n");
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para verificar si la cola está llena
        botonEsFull.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    if (cola[0].esFull()) {
                        areaSalida.append("🟢 La cola está llena.\n");
                    } else {
                        areaSalida.append("🔴 La cola NO está llena.\n");
                    }
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para llenar la cola automáticamente
        botonLlenarAleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    Random rand = new Random();
                    for (int i = 0; i < cola[0].getCapacidad(); i++) {
                        int numAleatorio = rand.nextInt(100); // Generar números aleatorios entre 0 y 99
                        cola[0].enqueue(numAleatorio, areaSalida);
                    }
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para limpiar el área de salida
        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaSalida.setText(""); // Limpiar el área de salida
            }
        });

        // Acción para mostrar la capacidad de la cola
        botonMostrarCapacidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    areaSalida.append("📦 Capacidad de la cola: " + cola[0].getCapacidad() + "\n");
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });

        // Acción para ver elementos en la cola
        botonVerElementos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cola[0] != null) {
                    areaSalida.append("🧾 Elementos en la cola: ");
                    int[] elementos = cola[0].verElementos(); // Método que debes implementar en la clase ColaClass
                    for (int elemento : elementos) {
                        areaSalida.append(elemento + " "); // Mostrar todos los elementos
                    }
                    areaSalida.append("\n");
                } else {
                    areaSalida.append("⚠️ Por favor define primero el tamaño de la cola.\n");
                }
            }
        });
    }
}
