package baleadas.intergalacticas;

import javax.swing.JOptionPane;

public class ListaEnlazadaCocinero {
    NodoCocinero primero;
    NodoCocinero ultimo;
    int tamaño;

    public ListaEnlazadaCocinero() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    public boolean estaVacio(){
        return primero == null;
    }
    
    public void add(Cocineros c){
        if (this.primero == null) {
            NodoCocinero n = new NodoCocinero(c);
            primero = n;
            ultimo = n;
        }else{
            NodoCocinero n = new NodoCocinero(c);
            NodoCocinero temp = primero;
            while(temp.siguiente != null){
                temp = temp.siguiente;
            }
            temp.setSiguiente(n);
            this.ultimo = n;
        }
        tamaño++;
    }
    
    public void delete(int pos){
        NodoCocinero eliminar = null;
        if(estaVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            NodoCocinero actual = primero;
            while(actual.getSiguiente() != ultimo) {
                actual = actual.getSiguiente();
            }
            eliminar = actual.getSiguiente();
            actual.setSiguiente(null);
            ultimo = actual;
        }
        this.tamaño--;
    }
}
