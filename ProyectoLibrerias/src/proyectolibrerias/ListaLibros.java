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
public class ListaLibros {   
//Atributos
private NodoLibro head;
private NodoLibro current;
private NodoLibro tail;
private int size;

public ListaLibros(){
    this.head = new NodoLibro();
    this.current = this.head;
    this.tail = this.head;
    this.size = 0;
}

public void insert(Libro pLibro) {
    //Insertar en cualquier posición
    System.out.println(pLibro.getNombre());
    NodoLibro newNode = new NodoLibro(pLibro, this.current, this.current.getNext());
    if (this.current != this.tail)
        this.current.getNext().setPrevious(newNode);
    this.current.setNext(newNode);
    //Necesario si se está insertando al final de la lista
    if (this.current == this.tail) {
        this.tail = tail.getNext();
    }
    this.size++;
}

public void append(Libro pLibro) {
    //insertar en cualquier posición
    NodoLibro newNode = new NodoLibro(pLibro, this.tail, null);
    this.tail.setNext(newNode);
    this.tail = newNode;
    this.size++;
}

public void remove(){
    //Verificar que la lista no está vacía
    if ((this.head == this.current) && (this.head == this.tail)){
        System.out.println("Lista vacía, no se puede remover ningún elemento");
        return;
    }
    if (this.head == this.current){
        System.out.println("Nodo especial no se puede borrar");
        return;
    }
    //Ultimo nodo
    if(this.current == this.tail){
        this.current.getPrevious().setNext(null);
        this.tail = this.current.getPrevious();
    } else {
        this.current.getNext().setPrevious(this.current.getPrevious());
        this.current.getPrevious().setNext(this.current.getNext());

    }
    this.current = this.current.getPrevious();
    this.size--;

}
    //Getters
    public Object getDato(){
        return this.current.getDato();
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
        return true;
    }

    public boolean previous() {
        if (this.current == this.head) {
            System.out.println("Actualmente en primer nodo, no se puede retroceder");
            return false;
        }
        this.current = this.current.getPrevious();
        return true;
    }
    public void goToStart(){
        this.current = this.head;
    }

    public void goToEnd(){
        this.current = this.tail;
    }
    public Libro goToPos(int pos) {
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
        return current.getDato();
    }
    //Metodo para validar la entrada de nuevas librerias
}
