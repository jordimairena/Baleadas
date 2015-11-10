/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas.intergalacticas;

import javax.swing.JProgressBar;

/**
 *
 * @author jordi
 */
public class AdministrarBarra {
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    protected double hora;
     public AdministrarBarra() {
    }

    public AdministrarBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.hora=hora;
        
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
   
    public void run(){
    
        while (vive){
            if (avanzar) {
                barra.setValue(barra.getValue()+1);
                if (barra.getValue()==hora) {
                    vive=false;
                }
                try {
                    Thread.sleep((long) hora);
                } catch (Exception e) {
                }
                
            }
            
        }
        
}
    
}
