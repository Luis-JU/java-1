/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S13;

/**
 *
 * @author juju
 */
public class PrismasRectangulo {
    private Rectangulo rectangulo;
    private Double ladoA;
    private Double ladoB;
    private double altura;
    
    public double getLateral () {
        return 2 * rectangulo.getSuma() * altura;
    }
    
    public double getArea () {
        return this.getLateral() * 2 * rectangulo.getSuma();
    }
    
     public double getVolumen () {
        return rectangulo.getA() * rectangulo.getB() * altura;
    }       

    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    public Double getLadoA() {
        return ladoA;
    }

    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    public Double getLadoB() {
        return ladoB;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     
    
}
