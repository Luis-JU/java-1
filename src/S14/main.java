/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S14;

/**
 *
 * @author juju
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Icosaedro[] icos = new Icosaedro[15];
        
        for (int i = 0; i < icos.length; i++) {
            icos[i] = new Icosaedro(rand());
        }
        for (int i = 0; i < icos.length; i++) {
            System.out.println(
                    "ico: " + icos[i].getArista() + " - " 
                            + icos[i].getArea() + " - " 
                            + icos[i].getVOlumen()
            );
        }
    }
    
    private static int rand() {
        int max = 9; 
        int min = 1;
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    
}
