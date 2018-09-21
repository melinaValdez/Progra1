package proyectolibrerias;

/**
 *
 * @author Melina
 */
public class ListaDoble {
     //atributos LinkedList
    private NodoDoble head;
    private NodoDoble current;
    private NodoDoble tail;
    private int position;
    private int size;

    public ListaDoble(){
        this.head = new NodoDoble();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }
    /**
     * Agrega un nuevo elemento a la lista
     * @param element
     */
    public void insert(Object element) {
        //insertar en cualquier posición
        NodoDoble newNode = new NodoDoble(element, this.current, this.current.getNext());
        if (this.current != this.tail)
            this.current.getNext().setPrevious(newNode);
        this.current.setNext(newNode);
        //necesario si se está insertando al final de la lista
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;
    }

    /**
     * Agrega un nuevo elemento a la lista
     * @param element
     */
    public void append(Object element) {
        //insertar en cualquier posición
        NodoDoble newNode = new NodoDoble(element, this.tail, null);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public void remove(){
        //verificar que la lista no está vacía
        if ((this.head == this.current) && (this.head == this.tail)){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        }
        if (this.head == this.current){
            System.out.println("Nodo especial no se puede borrar");
            return;
        }

        //último nodo
        if(this.current == this.tail){
            this.current.getPrevious().setNext(null);
            this.position--;
            this.tail = this.current.getPrevious();
        } else {
            this.current.getNext().setPrevious(this.current.getPrevious());
            this.current.getPrevious().setNext(this.current.getNext());

        }
        this.current = this.current.getPrevious();
        this.size--;
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
        this.current = this.current.getPrevious();
        this.position--;
        return true;
    }
    
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
    public Object buscarPorIssn(int pIssn, Libreria pLibreria){
        Libro libro;
        for (int cont = 0; cont < pLibreria.getListaLibros().getSize(); cont++){
            libro = (Libro)pLibreria.getListaLibros().getElement();
            if (libro.getIssn() == pIssn ){
                return libro;
            }
        }
        return null;
    }
}
