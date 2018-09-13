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
public class NodoLibro {
    private NodoLibro current;
    private NodoLibro next;
    private NodoLibro previous;
    private Libro dato;
    //Constructores
     public NodoLibro() {
            this.dato = null;
            this.next = null;
            this.previous = null;
        }
     
    public NodoLibro(Libro pDato) {
        this.dato = pDato;
        this.next = null;
        this.previous = null;
    }

    public NodoLibro(Libro pDato,NodoLibro pPrevious, NodoLibro pNext) {
        this.dato = pDato;
        this.previous = pPrevious;
        this.next = pNext;
    }

    //Getters y setters
    public NodoLibro getCurrent() {
        return current;
    }

    public void setCurrent(NodoLibro current) {
        this.current = current;
    }

    public NodoLibro getNext() {
        return next;
    }

    public void setNext(NodoLibro next) {
        this.next = next;
    }

    public NodoLibro getPrevious() {
        return previous;
    }

    public void setPrevious(NodoLibro previous) {
        this.previous = previous;
    }

    public Libro getDato() {
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }
}
    