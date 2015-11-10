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
public class Lista {

    NodoPlato head;
    protected int tamano;

    public Lista() {
        this.head = null;
    }

    public void setHead(NodoPlato head) {
        this.head = head;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void insert(Plato plato) {
        NodoPlato newNodo = new NodoPlato(plato);
        NodoPlato temp = head;

        if (tamano == 0) {
            this.setHead(newNodo);
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNodo);
            tamano += 1;
        }
    }

    public void delete(int tamano) {
        NodoPlato temp = head;
        NodoPlato temp2 = temp.getNext();//siguiente
        NodoPlato temp3 = temp2.getNext();
        int cont=0;
        if (tamano == 0) {
            this.setHead(temp2);
        } else {        
            while (temp.getNext() != head) {
                 //System.out.println("W");    
                if (cont == tamano) {
                    //System.out.println("CONT==POS-1");                    
                    temp.setNext(temp2.getNext());                    
                    break;
                }else if(cont==tamano-1){
                    //System.out.println("E");
                    temp.setNext(temp2.getNext().getNext());
                }else{
                    temp.setNext(temp2);
                }
                cont++;

            }
        }
    }

    public void Print_Lista() {
        NodoPlato temp = head;
        while (temp != null) {
            System.out.println(temp.getPlato());
            temp = temp.next;
        }
    }
    
    public NodoPlato peek(int pos){
        int tempNum = 0;
        NodoPlato temp = head;
        while(temp.getNext() != null){
            tempNum++;
            if (pos == tempNum) {
                break;
            }else{
                temp = temp.getNext();
            }
        }
        return temp;
    }
}
