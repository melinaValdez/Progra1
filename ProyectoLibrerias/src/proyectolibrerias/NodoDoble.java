package proyectolibrerias;

/**
 *
 * @author Melina
 */
public class NodoDoble {
    //atributos

        private Object element;
        private NodoDoble next;
        private NodoDoble previous;

        //Constructores
        public NodoDoble() {
            this.element = null;
            this.next = null;
            this.previous = null;
        }

        public NodoDoble(Object element) {
            this.element = element;
            this.next = null;
            this.previous = null;
        }

        public NodoDoble(Object element,NodoDoble previous, NodoDoble next) {
            this.element = element;
            this.previous = previous;
            this.next = next;

        }

        //métodos

        public Object getElement() {
            return this.element;
        }

        public void setElement(Object element) {
            this.element = element;
        }

        public NodoDoble getNext() {
            return this.next;
        }

        public void setNext(NodoDoble next) {
            this.next = next;
        }

        public NodoDoble getPrevious() {
            return this.previous;
        }

        public void setPrevious(NodoDoble previous) {
            this.previous = previous;
        }
    }
