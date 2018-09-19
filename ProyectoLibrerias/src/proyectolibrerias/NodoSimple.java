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
public class NodoSimple {
    private Object element;
        private NodoSimple next;

        //Constructores
        public NodoSimple() {
            this.element = null;
            this.next = null;
        }

        public NodoSimple(Object element) {
            this.element = element;
            this.next = null;
        }

        public NodoSimple(Object element, NodoSimple next) {
            this.element = element;
            this.next = next;
        }

        //métodos

        public Object getElement() {
            return this.element;
        }

        public void setElement(Object element) {
            this.element = element;
        }

        public NodoSimple getNext() {
            return this.next;
        }

        public void setNext(NodoSimple next) {
            this.next = next;
        }
    }
