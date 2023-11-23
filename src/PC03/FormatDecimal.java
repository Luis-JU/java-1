/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC03;

import java.text.DecimalFormat;

/**
 *
 * @author juju
 */
public class FormatDecimal {

    public static double format(double value) {
        DecimalFormat formato = new DecimalFormat("#.##");
        return Double.parseDouble(formato.format(value));
    }
}
