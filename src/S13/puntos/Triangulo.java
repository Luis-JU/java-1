/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S13.puntos;

/**
 *
 * @author juju
 */
public class Triangulo {
    private Punto2D p1;
    private Punto2D p2;
    private Punto2D p3;
    
    public double getPerimetro () {
        Segmento s1 = new Segmento();
        s1.setP1(p1);
        s1.setP2(p2);
        
        Segmento s2 = new Segmento();
        s2.setP1(p2);
        s2.setP2(p3);
        
        Segmento s3 = new Segmento();
        s3.setP1(p3);
        s3.setP2(p1);
        
        return s1.getDistancia() + s2.getDistancia() + s3.getDistancia();
    }
    
    public double getArea() {
        
        double fila1 = p1.getX() * (p2.getY() - p3.getY());
        double fila2 = p2.getX() * (p3.getY() - p1.getY());
        double fila3 = p3.getX() * (p1.getY() - p2.getY());
        
        return 0.5 * Math.abs(fila1 + fila2 + fila3);
    }
}
