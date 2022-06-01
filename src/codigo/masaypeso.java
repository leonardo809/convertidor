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
public class masaypeso {
    private double res;
    public String amaw2gramo(Double num, String medida){
        switch(medida){
            case"Tonelada(t)":
                res=num*1000000;
            break;
            
            case"Kilogramo(kg)":
                res=num*1000;
            break;
            
            case"Gramo(g)":
                res=num;
            break;                        
            case"Tonelada corta":
                res=num*907184.74;
            break;
            
            case"Libra(lb)":
                res=num*453.59;
            break;
            case"Onza":
                res=num*28.35;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(res);
    }
    public String gramo2amaw(Double num, String medida){
        switch(medida){
            case"Tonelada(t)":
                res=num/1000000;
            break;            
            case"Kilogramo(kg)":
                res=num/1000;
            break;
            
            case"Gramo(g)":
                res=num;
            break;
            
            case"Tonelada corta":
                res=num/907184.74;
            break;            
            case"Libra(lb)":
                res=num/453.59;
            break;
            case"Onza":
                res=num/28.35;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Error", "Error",JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(res);
    }
}
