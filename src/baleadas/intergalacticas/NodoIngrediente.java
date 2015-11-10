package baleadas.intergalacticas;

public class NodoIngrediente {
    Ingredientes ingrediente;
    NodoIngrediente siguiente;

    public NodoIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
        this.siguiente = null;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

    public NodoIngrediente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoIngrediente siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
