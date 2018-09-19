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
public class ListaSimple {
    //atributos LinkedList
    private NodoSimple head;
    private NodoSimple current;
    private NodoSimple tail;
    private int position;
    private int size;
    private static ListaSimple instanciaLibrerias = null;
    private static ListaSimple instanciaClientes = null;

    //constructores LinkedList

    /**
     * Contructor predeterminado
     */
    public ListaSimple() {
        this.head = new NodoSimple();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }

    //Metodos de patron singleton utilizado para mantener una sola lista de librerias y clientes en todo el programa
    public static ListaSimple getLibrariesInstance() {
       if(instanciaLibrerias == null) {
          instanciaLibrerias = new ListaSimple();
       }
       return instanciaLibrerias;
    }
    public static ListaSimple getClientsInstance() {
       if(instanciaClientes == null) {
          instanciaClientes = new ListaSimple();
       }
       return instanciaClientes;
    }
    /**
     * Agrega un nuevo elemento a la lista
     * @param element El elemento a agregar
     */
    public void insert(Object element) {
        //insertar en cualquier posición
        NodoSimple newNode = new NodoSimple(element, this.current.getNext());
        this.current.setNext(newNode);
        //necesario si se está insertando al final de la lista
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;

    }

    public void append(Object element) {
        //siempre se pega al final de la lista
        NodoSimple newNode = new NodoSimple(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public void remove() {
        //verificar que la lista no está vacía
        if ((this.head == this.current) && (this.head == this.tail)){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        } //también if (this.size == 0) ...

        //en temp se va a almacenar el nodo ANTERIOR al que se quiere borrar
        NodoSimple temp = head;
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

    public void clear() {
        this.head = this.tail = this.current = new NodoSimple();
        this.position = -1;
        this.size = 0;
    }

    public Object getElement(){
        return this.current.getElement();
    }

    public int getSize() {
        return this.size;
    }

    public boolean next() {
        if (this.current == this.tail) {
            System.out.println("Actualmente en último nodo, no se puede avanzar");
            return false;
        }
        this.current = this.current.getNext();
        this.position++;
        return true;
    }

    public boolean previous() {
        if (this.current == this.head) {
            System.out.println("Actualmente en primer nodo, no se puede retroceder");
            return false;
        }
        NodoSimple temp = head;
        this.position = -1;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
            this.position++;
        }
        this.current = temp;
        return true;
    }

    public int getPosition() {
        return this.position;
    }

    public void goToStart(){
        this.current = this.head;
        this.position = -1;
    }

    public void goToEnd(){
        this.current = this.tail;
        this.position = this.size - 1;
    }

    //En el siguiente metodo, se usa una posicion especifica para obtener un elemento de la lista
    public Object goToPos(int pos) {
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
        return current.getElement();
    }
    //Metodo para validar la entrada de nuevas librerias
    /*public boolean verificar(String pNombre){
        Object verificador;
        //Se busca que ya no haya otra libreria registrada con ese nombre
        for (int pos = 0; pos < size; pos++){
            Object temporal = goToPos(pos);
            if (temporal == null){
                return false;
            }
            else{
                verificador = (Libreria)temporal;
                if (verificador.equals(pNombre)){
                    return false;
                }
            }
        }
        return true;
    }*/
}
