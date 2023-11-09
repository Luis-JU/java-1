/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S13;

/**
 *
 * @author juju
 */
public class executable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tri = new Triangulo(3, 2, 3);
        Rectangulo rec = new Rectangulo(5, 4);
        Cuadrado cua = new Cuadrado(13);

        PrismasRectangulo prec = new PrismasRectangulo();
        prec.setRectangulo(rec);
        
        prec.setAltura(11);
        prec.setLadoA(11.3);
        prec.setLadoB(6.6);
        
        
        PrimasTriangulo ptri = new PrimasTriangulo();
        ptri.setTriangulo(tri);
        
        ptri.setAltura(11);
        
      
        
        System.out.println("triangulo:"
                + "\n Lateral: " + geo.getCurrentLateral()
                + "\n Area: " + geo.getCurrentArea()
                + "\n Volumen: " + geo.getCurrentVolumen()
        );
        
        geo.calculateRectangulo(rec);
        System.out.println("Rectangulo:"
                + "\n Lateral: " + geo.getCurrentLateral()
                + "\n Area: " + geo.getCurrentArea()
                + "\n Volumen: " + geo.getCurrentVolumen()
        );
        
        geo.calculateCubo(cua);
        System.out.println("Cubo:"
                + "\n Lateral: " + geo.getCurrentLateral()
                + "\n Area: " + geo.getCurrentArea()
                + "\n Volumen: " + geo.getCurrentVolumen()
        );
        
    }
    
}
