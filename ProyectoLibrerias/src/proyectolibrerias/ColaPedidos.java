/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibrerias;

/**
 *
 * @author Jose Daniel
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class ColaPedidos {

    private NodoCola anterior, posterior; // dos apuntadores de TDA Cola
    private int contador; // lleva el control de elementos encolados

    public ColaPedidos() {
        this.anterior = this.posterior = null;
        this.contador = 0;
    }

    public int getSize() throws ColaException {
        if (this.isEmpty()) {
            throw new ColaException("La cola esta vacia");
        }
        return contador;
    }

    
    public void anular() {
        this.anterior = this.posterior = null;
    }

    
    public boolean isEmpty() {
        return anterior == null;
    }

    
    public int posicion(Object elemento) throws ColaException {
        if (this.isEmpty()) {
            throw new ColaException("La cola esta vacia");
        }
        NodoCola aux = anterior;
        int pos = 1;
        while (aux != null) {
            if (aux.elemento.equals(elemento)) {
                return pos;
            }
            aux = aux.sgte;
            pos++;
        }
        return -1;
    }

    
    public void encolar(Object elemento) throws ColaException {
        if (this.isEmpty()) { // si la cola no existe
            posterior = new NodoCola(elemento);
            anterior = posterior; // garantiza que el anterior quede apuntando al primer NodoCola
        } else {
            posterior.sgte = new NodoCola(elemento);
            posterior = posterior.sgte; // se mueve al final (al ultimo NodoCola)
        }
        this.contador++; // aumenta el numero de elementos que encola
    }

    public Object desencolar() throws ColaException {
        if (this.isEmpty()) {
            throw new ColaException("La cola está vacia");
        }
        Object elemento = anterior.elemento;
        //Caso1: solo se tiene un elemento encolado
        if (anterior == posterior) {
            this.anular();//elimina la cola
        }//if
        //CASO2:Existen varios elementos encolados, al menos 2
        else {
            //elemento a desencolar
            anterior = anterior.sgte;
        }//else
        this.contador--;//para actualizar la cantidad de elementos encolados
        return elemento;
    }

    
    public boolean existe(Object elemento) throws ColaException {
        if (this.isEmpty()) {
            throw new ColaException("La cola esta vacia");
        }
        NodoCola aux = anterior;
        while (aux != null) {
            if (aux.elemento.equals(elemento)) {
                return true;
            }
            aux = aux.sgte;
        }
        return false;
    }

    
    public Object frente() throws ColaException {
        if (this.isEmpty()) {
            throw new ColaException("La cola esta vacia");
        }
        return anterior.elemento;
    }

    
    public String toString() {
        String resultado = "";
        try {
            if (this.isEmpty()) {
                throw new ColaException("La cola esta vacia");
            }
            resultado = "COLA ENLAZADA CON NodoCola CABECERA   ";
            NodoCola aux = anterior; // recorrer con el principio de colas
            while (aux != null) {
                resultado += aux.elemento + " ";
                aux = aux.sgte;
            }
        } catch (ColaException ex) {
            Logger.getLogger(ColaPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
