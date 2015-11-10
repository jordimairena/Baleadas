/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas.intergalacticas;

/**
 *
 * @author jordi
 */
public class NodoPlato {
    NodoPlato next;
    Plato plato;

    public NodoPlato(Plato plato) {
        this.plato = plato;
        this.next=null;
    }

    public NodoPlato getNext() {
        return next;
    }

    public void setNext(NodoPlato next) {
        this.next = next;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    
   
    
}
