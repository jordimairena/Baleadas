package baleadas.intergalacticas;

import javax.swing.JOptionPane;

public class PilaCocinero {
    NodoCocinero head;
    int tamaño;

    public PilaCocinero() {
        this.head = null;
        this.tamaño = 0;
    }
    
    public boolean estaVacio(){
        return head == null;
    }
    
    public void push(Cocineros c){
        if (this.head == null) {
            NodoCocinero n = new NodoCocinero(c);
            head = n;
        }else{
            NodoCocinero n = new NodoCocinero(c);
            n.setSiguiente(head);
            this.head = n;
        }
        tamaño++;
    }
    
    public NodoCocinero pop(int pos){
        NodoCocinero eliminar = null;
        if(estaVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }
        if(tamaño == 1) {
            eliminar = head;
            head = null;
            this.tamaño--;
            return eliminar;
        }
        else {
            NodoCocinero actual = head;
            this.head = head.getSiguiente();
            this.tamaño--;
            return actual;
        }  
    }
    
    public void imprimir(){
        NodoCocinero temp = head;
        while(temp.siguiente != null){
            System.out.println(temp.getCocinero().getNombre());
            temp = temp.siguiente;
        }
    }
}
