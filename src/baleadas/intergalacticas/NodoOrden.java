package baleadas.intergalacticas;

public class NodoOrden {
    Ordenes orden;
    NodoOrden siguiente;

    public NodoOrden(Ordenes orden) {
        this.orden = orden;
        this.siguiente = null;
    }

    public Ordenes getOrden() {
        return orden;
    }

    public void setOrden(Ordenes orden) {
        this.orden = orden;
    }

    public NodoOrden getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoOrden siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
