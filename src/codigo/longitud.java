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
public class longitud {
    private double op;
    public String al2metro(Double num, String medida){//combo box1
        switch(medida){
            case "Kilómetro(km)":
                op=num*1000;
            break;
            case "Decímetro(dm)":
                op=num/10;
            break;
            case "Centímetro(cm)":
                op=num/100;
            break;
            case "Milímetro(mm)":
                op=num/1000;
            break;
            case "Yarda(yd)":
                op=num/1.09361;
            break;
            case "Pie(ft)":
                op=num/3.28084;
            break;
            case "Pulgada(in)":
                op=num/39.3701;
            break;
            case "Metro(m)":
                op=num;
            break;
            case "Milla(ml)":
                op=num*1609;
            break;
            default:
                JOptionPane.showMessageDialog(null, "Medida no registrada", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(op);
    }
    public String metro2al(Double num, String medida){//combo box2
        switch(medida){
            case "Kilómetro(km)":
                op=num/1000;
            break;
            case "Decímetro(dm)":
                op=num*10;
            break;
            case "Centímetro(cm)":
                op=num*100;
            break;
            case "Milímetro(mm)":
                op=num*1000;
            break;
            case "Yarda(yd)":
                op=num*1.09361;
            break;
            case "Pie(ft)":
                op=num*3.28084;
            break;
            case "Pulgada(in)":
                op=num*39.3701;
            break;
            case "Metro(m)":
                op=num;
            break;
            case "Milla(ml)":
                op=num/1609;
            break;
            default:
                JOptionPane.showMessageDialog(null, "Medida no registrada", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        }
        return Double.toString(op);
    }

    
}
