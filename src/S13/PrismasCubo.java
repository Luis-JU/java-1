/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S13;

/**
 *
 * @author juju
 */
public class PrismasCubo {
    private Cuadrado cuadrado;
    private Double lado;
    
     public double getLateral () {
        return 4 * cuadrado.getArea();
    }
    
    public double getArea () {
        return 6* cuadrado.getArea();
    }
    
     public double getVolumen () {
        return cuadrado.getArea() * cuadrado.getLado();
    } 
}
