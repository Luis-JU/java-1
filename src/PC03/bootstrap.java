/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PC03;

/**
 *
 * @author juju
 */
public class bootstrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo3D triangulo = new Triangulo3D();
        Cuadrilatero3D cuadrilatero = new Cuadrilatero3D();
        
        Punto3D punto1 = new Punto3D(9, -4, 1);
        Punto3D punto2 = new Punto3D(7, -9, 0);
        Punto3D punto3 = new Punto3D(5, -2, 1);
        
        Punto3D punto4 = new Punto3D(6, -4, 0);

        triangulo.setP1(punto1);
        triangulo.setP2(punto2);
        triangulo.setP3(punto3);
        
        cuadrilatero.setP1(punto1);
        cuadrilatero.setP2(punto2);
        cuadrilatero.setP3(punto3);
        cuadrilatero.setP4(punto4);

        System.out.println("triangulo:"
                + "\n Area: " + triangulo.getArea()
                + "\n Permitro: " + triangulo.getPerimetro()
        );
        
        System.out.println("cuadrilatero:"
                + "\n Area: " + cuadrilatero.getArea()
                + "\n Permitro: " + cuadrilatero.getPerimetro()
        );
    }

}
