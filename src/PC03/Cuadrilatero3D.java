/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC03;

/**
 *
 * @author juju
 */
public class Cuadrilatero3D {
    private Punto3D p1;
    private Punto3D p2;
    private Punto3D p3;
    private Punto3D p4;
    
    
    
    public double getPerimetro () {
        Segmento3D s1 = new Segmento3D();
        Segmento3D s2 = new Segmento3D();
        Segmento3D s3 = new Segmento3D();
        Segmento3D s4 = new Segmento3D();
    
        s1.setP1(p1);
        s1.setP2(p2);
        
        s2.setP1(p2);
        s2.setP2(p3);
        
        s3.setP1(p3);
        s3.setP2(p4);
        
        s4.setP1(p4);
        s4.setP2(p1);
        
        return FormatDecimal.format(s1.getDistancia() + s2.getDistancia() 
                + s3.getDistancia() +  s3.getDistancia());
    }
    
    public double getArea() {
        double fila1 = Math.pow((
                ((p2.getY() - p1.getY()) * (p4.getZ() - p1.getZ()) - 
                ((p2.getZ() -p1.getZ()) * (p4.getY() - p1.getY())))
                ), 2);
        double fila2 = Math.pow((
                ((p2.getZ() - p1.getZ()) * (p4.getX() - p1.getX()) - 
                ((p2.getX() -p1.getX()) * (p4.getZ() - p1.getZ())))
                ), 2);
        double fila3 = Math.pow((
                ((p2.getX() - p1.getX()) * (p4.getY() - p1.getY()) - 
                ((p2.getY() -p1.getY()) * (p4.getX() - p1.getX())))
                ), 2);
      
        return FormatDecimal.format(
                0.5 * Math.sqrt(fila1 + fila2 + fila3)
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

    public Punto3D getP3() {
        return p3;
    }

    public void setP3(Punto3D p3) {
        this.p3 = p3;
    }

    public Punto3D getP4() {
        return p4;
    }

    public void setP4(Punto3D p4) {
        this.p4 = p4;
    }
}
