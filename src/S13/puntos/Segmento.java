package S13.puntos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import S13.puntos.Punto2D;

/**
 *
 * @author juju
 */
public class Segmento {
    private Punto2D p1;
    private Punto2D p2;
    
    public double getDistancia () {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY()- p2.getY(), 2) );
    }

    public Punto2D getP1() {
        return p1;
    }

    public void setP1(Punto2D p1) {
        this.p1 = p1;
    }

    public Punto2D getP2() {
        return p2;
    }

    public void setP2(Punto2D p2) {
        this.p2 = p2;
    }
    
    
    
}
