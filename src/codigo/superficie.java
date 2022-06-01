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
public class superficie {
    private double res;
    public String as2metroc(Double num, String medida){
        switch(medida){
            case "Kilómetro cuadrado":
                res=num*1000000;
            break;
            case "Hectárea(ha)":
                res=num*10000;
            break;
            
            case "Metro cuadrado":
                res=num;
            break;            
            case "Milla cuadrada":
                res=num*2589987.83;
            break;
            case "Acre":
                res=num*4046.85;
            break;
            case "Pie cuadrado":
                res=num*0.09;
            break;
            case "Pulgada cuadrada":
                res=num*0.000645;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
            
        }
        return Double.toString(res);
    }
    public String metroc2as(Double num, String medida){
        switch(medida){
            case "Kilómetro cuadrado":
                res=num*1000000;
            break;
            case "Hectárea(ha)":
                res=num*10000;
            break;          
            case "Metro cuadrado":
                res=num;
            break;
            case "Milla cuadrada":
                res=num*2589987.83;
            break;
            case "Acre":
                res=num*4046.85;
            break;
            case "Pie cuadrado":
                res=num*0.09;
            break;
            case "Pulgada cuadrada":
                res=num*0.000645;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
            
        }
        return Double.toString(res);
    }
    
}
