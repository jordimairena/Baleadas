/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas.intergalacticas;

import javax.swing.JLabel;

/**
 *
 * @author jordi
 */
public class HiloTiempo extends Thread {
    protected JLabel tiempo;

    public HiloTiempo() {
    }

    public HiloTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
    
}
