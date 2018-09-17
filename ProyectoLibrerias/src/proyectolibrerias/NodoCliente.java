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
public class NodoCliente {
    private NodoCliente current;
    private NodoCliente next;
    private Cliente cliente;
    //Constructores
     public NodoCliente() {
            this.cliente = null;
            this.next = null;
        }
     
    public NodoCliente(Cliente pCliente) {
        this.cliente = pCliente;
        this.next = null;
    }

    public NodoCliente(Cliente pCliente, NodoCliente pNext) {
        this.cliente = pCliente;
        this.next = pNext;
    }

    //Getters y setters
    public NodoCliente getCurrent() {
        return current;
    }

    public void setCurrent(NodoCliente current) {
        this.current = current;
    }

    public NodoCliente getNext() {
        return next;
    }

    public void setNext(NodoCliente next) {
        this.next = next;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
