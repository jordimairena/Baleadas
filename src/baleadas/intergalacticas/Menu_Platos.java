/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas.intergalacticas;

import java.util.ArrayList;

/**
 *
 * @author jordi
 */
public class Menu_Platos {    
    protected ArrayList<Plato> menu = new ArrayList<Plato>();

    public Menu_Platos() {
    }

    public Menu_Platos( ArrayList<Plato> menu) {
        this.menu=menu;
    }
    

    public ArrayList<Plato> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Plato> menu) {
        this.menu = menu;
    }
    
    
    
}
