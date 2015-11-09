package baleadas.intergalacticas;

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
        if(primero == null){
            return true;
        }
        return false;
    }
    
    public void add(Cocineros c){
        if (this.primero == null) {
            NodoCocinero n = new NodoCocinero(c);
            primero = n;
            ultimo = n;
        }else{
            NodoCocinero n = new NodoCocinero(c);
            while(n.siguiente == null){
                
            }
            
        }
    }
}
