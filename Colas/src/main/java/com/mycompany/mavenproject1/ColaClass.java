package com.mycompany.mavenproject1;

import java.util.LinkedList;
import javax.swing.JTextArea;

public class ColaClass {
    private LinkedList<Integer> cola;
    private int capacidad;

    public ColaClass(int capacidad) {
        this.capacidad = capacidad;
        this.cola = new LinkedList<>();
    }

    public void enqueue(int elemento, JTextArea areaSalida) {
        if (esFull()) {
            areaSalida.append("⚠️ La cola está llena. No se puede agregar el elemento: " + elemento + "\n");
        } else {
            cola.add(elemento);
            areaSalida.append("✅ Elemento agregado: " + elemento + "\n");
        }
    }

    public void dequeue(JTextArea areaSalida) {
        if (estaVacia()) {
            areaSalida.append("🚫 No se puede eliminar, la cola está vacía.\n");
        } else {
            int elementoEliminado = cola.removeFirst();
            areaSalida.append("🗑️ Elemento eliminado: " + elementoEliminado + "\n");
        }
    }

    public int peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return cola.getFirst();
    }

    public void vaciar(JTextArea areaSalida) {
        cola.clear();
        areaSalida.append("🗑️ La cola ha sido vaciada.\n");
    }

    public int contarElementos() {
        return cola.size();
    }

    public boolean esFull() {
        return cola.size() == capacidad;
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int[] verElementos() {
        int[] elementos = new int[cola.size()];
        for (int i = 0; i < cola.size(); i++) {
            elementos[i] = cola.get(i);
        }
        return elementos;
    }
}
