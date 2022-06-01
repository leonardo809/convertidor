/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public class temperatura {
    private double res;
    public String at2c(Double num, String medida){
        switch(medida){
            case "Fahrenheit":
                res=(num-5)*(5/9);
            break;
            case "Celsius":
                res=num;
            break;
            case "Kelvin":
                res=(num-273.15);
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(res);
    }
    public String c2at(Double num, String medida){
        switch(medida){
            case "Fahrenheit":
                res=(num*9/5)+32;
            break;
            case "Celsius":
                res=num;
            break;
            case "Kelvin":
                res=(num+273.15);
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;    
        }
        return Double.toString(res);
    }
}
