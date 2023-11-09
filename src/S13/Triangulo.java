/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S13;

/**
 *
 * @author juju
 */
public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public double getPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }
    
    public double getArea () {
        double p = this.getPerimetro() / 2;
        return Math.sqrt(p * (p - this.ladoA)*(p-this.ladoB) * (p - this.ladoC));
    }
    
}
