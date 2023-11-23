package PC03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author juju
 */
public class Segmento3D {
    private Punto3D p1;
    private Punto3D p2;
    
    public double getDistancia () {
        return Math.sqrt(
                Math.pow(p1.getX() - p2.getX(), 2) + 
                Math.pow(p1.getY() - p2.getY(), 2) + 
                Math.pow(p1.getZ() - p2.getZ(), 2)
        );
    }    

    public Punto3D getP1() {
        return p1;
    }

    public void setP1(Punto3D p1) {
        this.p1 = p1;
    }

    public Punto3D getP2() {
        return p2;
    }

    public void setP2(Punto3D p2) {
        this.p2 = p2;
    }
}
