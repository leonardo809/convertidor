/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import grafico.Portada;
import grafico.SplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public class Screenscreen {
    public static void main(String[] args){
        Portada portada=new Portada();
        SplashScreen Splash=new SplashScreen();
        Splash.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(358);
                Splash.lbl_porcentaje.setText(Integer.toString(i)+"%");
                Splash.Jpb_login.setValue(i);
                if(i==100){
                    Splash.setVisible(false);
                    portada.setVisible(true);
                }
            }
        }
        catch(InterruptedException e){
            Logger.getLogger(Screenscreen.class.getName()).log(Level.SEVERE,"Fallo de búsqueda ",e);
        }
    }
}
