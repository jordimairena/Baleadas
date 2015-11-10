package baleadas.intergalacticas;

public class ColaOrdenes {
   NodoOrden head;
   NodoOrden fondo;

    public ColaOrdenes() {
        this.head = null;
        this.fondo = null;
    }
   
   
    void insertar (Ordenes o){
        NodoOrden n = new NodoOrden (o);
        if (estaVacio ()) {
            head = n;
            fondo = n;
        } else {
            fondo.setSiguiente(n);
            fondo = n;
        }
    }
    
    public boolean estaVacio(){
        return head == null;
    }
    
    public NodoOrden extraer ()
    {
        if (!estaVacio ())
        {
            NodoOrden temp = head;
            if (head == fondo){
                head = null;
                fondo = null;
            } else {
                head = head.getSiguiente();
            }
            return temp;
        } else
            return null;
    }
    
    public void imprimir() {
        NodoOrden reco = head;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.getOrden().getNumerodeorden()+"-");
            reco=reco.getSiguiente();
        }
        System.out.println();
    }
}
