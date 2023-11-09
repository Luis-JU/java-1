/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S13;

/**
 *
 * @author juju
 */
public class PrimasTriangulo {
    
    private Triangulo triangulo;
    private double altura;
    
    public double getLateral () {
        return triangulo.getPerimetro() * altura;
    }
    
    public double getArea () {
        return this.getLateral() + 2 * triangulo.getArea();
    }
    
     public double getVolumen () {
        return triangulo.getArea() * altura;
    }       

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     
    
}
