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

    public Lista(NodoPlato head) {
        this.head = head;
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
            tamano+=1;
        }
    }

    public void delete(int tamano) {
        NodoPlato temp = head;
        int cont = 0;
        while (temp.getNext() != null) {
            NodoPlato temp2 = temp.getNext();
            if (cont == tamano - 1) {
                temp.setNext(temp2.getNext());
            }
            cont++;
        }
    }

    public void Print_Lista() {
        NodoPlato temp = head;
        while (temp != null) {
            System.out.println(temp.getPlato());
            temp = temp.next;
        }
    }
}
