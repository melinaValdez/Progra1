/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibrerias;

/**
 *
 * @author Melina
 */
public class NodoLibreria {
    //atributos
    private Libreria libreria;
    private NodoLibreria next;

    //Constructores
    public NodoLibreria() {
        this.libreria = null;
        this.next = null;
    }

    public NodoLibreria(Libreria pLibreria) {
        this.libreria = pLibreria;
        this.next = null;
    }

    public NodoLibreria(Libreria pLibreria, NodoLibreria next) {
        this.libreria = pLibreria;
        this.next = next;
    }

    //Métodos
    public Libreria getLibreria() {
        return this.libreria;
    }

    public void setLibreria(Libreria pLibreria) {
        this.libreria = pLibreria;
    }

    public NodoLibreria getNext() {
        return this.next;
    }

    public void setNext(NodoLibreria next) {
        this.next = next;
    }
}
