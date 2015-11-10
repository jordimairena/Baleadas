package baleadas.intergalacticas;
public class NodoCocinero {
    Cocineros cocinero;
    NodoCocinero siguiente;

    public NodoCocinero(Cocineros cocinero) {
        this.cocinero = cocinero;
        this.siguiente = null;
    }
    
    public Cocineros getCocinero() {
        return cocinero;
    }

    public void setCocinero(Cocineros cocinero) {
        this.cocinero = cocinero;
    }

    public NodoCocinero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCocinero siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
