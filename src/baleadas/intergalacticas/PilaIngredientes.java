package baleadas.intergalacticas;

import javax.swing.JOptionPane;

public class PilaIngredientes {
    NodoIngrediente head;
    int tamaño;

    public PilaIngredientes() {
        this.head = null;
        this.tamaño = 0;
    }
    
    public boolean estaVacio(){
        return head == null;
    }
    
    public void push(Ingredientes c){
        if (this.head == null) {
            NodoIngrediente n = new NodoIngrediente(c);
            head = n;
        }else{
            NodoIngrediente n = new NodoIngrediente(c);
            n.setSiguiente(head);
            this.head = n;
        }
        tamaño++;
    }
    
    public NodoIngrediente pop(int pos){
        NodoIngrediente eliminar = null;
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
            NodoIngrediente actual = head;
            this.head = head.getSiguiente();
            this.tamaño--;
            return actual;
        }  
    }
    
        public void imprimir(){
        NodoIngrediente temp = head;
        while(temp.siguiente != null){
            System.out.println(temp.getIngrediente().getNombre());
            temp = temp.siguiente;
        }
    }
}
