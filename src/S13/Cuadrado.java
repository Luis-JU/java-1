/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S13;

/**
 *
 * @author juju
 */
public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public double getArea () {
        return Math.pow(this.lado, 2);
    }

    public double getLado() {
        return lado;
    }    
}
