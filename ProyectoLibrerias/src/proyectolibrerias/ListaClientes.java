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
public class ListaClientes {
    private NodoCliente head;
    private NodoCliente current;
    private NodoCliente next;
    private NodoCliente tail;
    private int position;
    private int size;
    private static ListaClientes instance = null;
    
    //constructores LinkedList

    /**
     * Contructor predeterminado
     */
    protected ListaClientes() {
        this.head = new NodoCliente();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }
    //Metodo de patron singleton utilizado para mantener una sola lista de librerias en todo el programa
    public static ListaClientes getInstance() {
       if(instance == null) {
          instance = new ListaClientes();
       }
       return instance;
    }
    
    public boolean insert(Cliente pCliente) {
        //insertar en cualquier posición
        boolean verificar = verificar(pCliente.getCedula());
        if (verificar){
            NodoCliente newNode = new NodoCliente(pCliente, this.current.getNext());
            this.current.setNext(newNode);
            //necesario si se está insertando al final de la lista
            if (this.current == this.tail) {
                this.tail = tail.getNext();
            }
            this.size++;
        }
        return verificar;

    }

    public boolean append(Cliente pCliente) {
        //Siempre se pega al final de la lista
        boolean verificar = verificar(pCliente.getCedula());
        if (verificar){
            NodoCliente newNode = new NodoCliente(pCliente);
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.size++;
        }
        return verificar;
    }

    public void remove() {
        //verificar que la lista no está vacía
        if ((this.head == this.current) && (this.head == this.tail)){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        } //también if (this.size == 0) ...

        //en temp se va a almacenar el nodo ANTERIOR al que se quiere borrar
        NodoCliente temp = head;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
        }
        //borrar la referencia al nodo actual
        temp.setNext(this.current.getNext());
        //necesario si se esta borrando el último nodo
        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.position--;
        }
        else
            //necesario si se está borrando un nodo diferente al último
            this.current = this.current.getNext();

        //disminuir el tamaño
        this.size--;
    }
    //Funcion para eliminar todos los nodos de la lista
    public void clear() {
        this.head = this.tail = this.current = new NodoCliente();
        this.position = -1;
        this.size = 0;
    }

    //Getters and Setters
    public NodoCliente getHead() {
        return head;
    }

    public void setHead(NodoCliente head) {
        this.head = head;
    }

    public NodoCliente getCurrent() {
        return current;
    }

    public void setCurrent(NodoCliente current) {
        this.current = current;
    }

    public NodoCliente getTail() {
        return tail;
    }

    public void setTail(NodoCliente tail) {
        this.tail = tail;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodoCliente getNext() {
        return next;
    }

    public void setNext(NodoCliente next) {
        this.next = next;
    }
    
    //En el siguiente metodo, se usa una posicion especifica para obtener un elemento de la lista
    public Cliente goToPos(int pos) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("Posición inválida");
            return null;
        }
        int temp = 0;
        current = head.getNext();
        while (temp != pos){
            current = current.getNext();
            temp++;
        }
        return current.getCliente();
    }
    //Metodo para validar la entrada de nuevas librerias
    public boolean verificar(String pCedula){
        String verificador;
        //Se busca que ya no haya otra libreria registrada con ese nombre
        for (int pos = 0; pos < size; pos++){
            Cliente temporal = goToPos(pos);
            if (temporal == null){
                return false;
            }
            else{
                verificador = temporal.getCedula();
                if (verificador.equals(pCedula)){
                    return false;
                }
            }
        }
        return true;
    }
}
