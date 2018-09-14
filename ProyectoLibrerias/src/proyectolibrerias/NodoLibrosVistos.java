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
public class NodoLibrosVistos {
     // Variable en la cual se va a guardar el valor.
    private Object valor;
    // Variable para enlazar los NodoLibrosVistoss.
    private NodoLibrosVistos siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void NodoLibrosVistos(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public Object getValor() {
        return valor.toString();
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NodoLibrosVistos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLibrosVistos siguiente) {
        this.siguiente = siguiente;
    }

	@Override
	public String toString() {
		return "NodoLibrosVistos [valor=" + valor + "]";
	}
    
}





    

