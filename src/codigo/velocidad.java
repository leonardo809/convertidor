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
public class velocidad {
    private double res;
    public String av2mss(Double num, String medida){
        switch(medida){
            case "km/s":
                res=num*1000;
            break;
            case "m/s":
                res=num;
            break;
            case "km/h":
                res=num*0.28;
            break;
            case "Milla por segundo":
                res=num*1609.34;
            break;
            case "Milla por hora":
                res=num*0.45;
            break;
            case "Pie por segundo":
                res=num*0.3;
            break;
            case "nudo":
                res=num*0.51;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(res);
    }
    public String mss2av(Double num, String medida){
        switch(medida){
            case "km/s":
                res=num/1000;
            break;
            case "m/s":
                res=num;
            break;
            case "km/h":
                res=num/0.28;
            break;
            case "Milla por segundo":
                res=num/1609.34;
            break;
            case "Milla por hora":
                res=num/0.45;
            break;
            case "Pie por segundo":
                res=num/0.3;
            break;
            case "nudo":
                res=num/0.51;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(res);
    }
    
}
