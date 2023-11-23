/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC03;

/**
 *
 * @author juju
 */
public class Triangulo3D {
    private Punto3D p1;
    private Punto3D p2;
    private Punto3D p3;
    
    private Segmento3D s1 = new Segmento3D();
    private Segmento3D s2 = new Segmento3D();
    private Segmento3D s3 = new Segmento3D();
    
    public double getPerimetro () {
        s1.setP1(p1);
        s1.setP2(p2);
        
        s2.setP1(p2);
        s2.setP2(p3);
        
        s3.setP1(p3);
        s3.setP2(p1);
        
        return FormatDecimal.format(s1.getDistancia() + s2.getDistancia() + s3.getDistancia());
    }
    
    public double getArea() {
        double Heron = this.getPerimetro() / (double) 2;
        double areaCuadrado = Heron * (Heron - s1.getDistancia()) * 
                (Heron - s2.getDistancia()) * (Heron - s3.getDistancia());
        return FormatDecimal.format(Math.sqrt(areaCuadrado));
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
}
