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

    public void delete(int pos) {
        NodoPlato temp = head;
        NodoPlato temp2 = null;
        int cont = 0;
        while (temp.getNext() != null) {
            if (cont == pos - 1) {
                temp2 = temp;
            }

            if (cont == pos) {
                temp = temp.getNext();
                break;
            }
            temp = temp.getNext();
            cont++;
        }

        temp2.setNext(temp);
    }

    public void Print_Lista() {
        NodoPlato temp = head;
        while (temp != null) {
            System.out.println(temp.getPlato());
            temp = temp.next;
        }
    }

    public NodoPlato peek(int pos) {
        int tempNum = 0;
        NodoPlato temp = head;
        while (temp.getNext() != null) {
            tempNum++;
            if (pos == tempNum) {
                break;
            } else {
                temp = temp.getNext();
            }
        }
        return temp;
    }
}
