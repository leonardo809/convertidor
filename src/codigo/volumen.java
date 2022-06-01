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
public class volumen {
    private double res;
    public String av2litro(Double num,String medida){
        switch(medida){
            case "Metro Cúbico":
                res=num*1000;
            break;
            case "Litro":
                res=num;
            break;
            case "Mililitro":
                res=num*0.001;
            break;
            case "Centímetro cúbico":
                res=num*0.001;
            break;
            case "Barril":
                res=num*163.65;
            break;
            case "Galón(gal)":
                res=num*4.55;
            break;
            case "Pinta(pt)":
                res=num*0.47;
            break;
            case "Onza líquida(oz)":
                res=num*0.03;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(res);
    }
    public String litro2av(Double num,String medida){
        switch(medida){
            case "Metro Cúbico":
                res=num/1000;
            break;
            case "Litro":
                res=num;
            break;
            case "Mililitro":
                res=num/0.001;
            break;
            case "Centímetro cúbico":
                res=num/0.001;
            break;
            case "Barril":
                res=num/163.65;
            break;
            case "Galón(gal)":
                res=num/4.55;
            break;
            case "Pinta(pt)":
                res=num/0.47;
            break;
            case "Onza líquida(oz)":
                res=num/0.03;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(res);
    }
}
