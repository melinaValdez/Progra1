/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibrerias;

import static proyectolibrerias.Tema.*;

/**
 *
 * @author Melina
 */
public class ProyectoLibrerias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLibrerias listaLibrerias = new ListaLibrerias();
        Libreria Lehman = new Libreria("Lehman","Costa Rica","27711475","9am-6pm");
        listaLibrerias.insert(Lehman);
        ListaLibros listaLehman = new ListaLibros();
        Lehman.setListaLibros(listaLehman);
        Libro hijaHumoHueso = new Libro("Hija de humo y hueso",15,32,FICCION);
        Libro elSenorDeLosAnillos = new Libro("El señor de los anillos",7,123,FICCION);
        Lehman.getListaLibros().insert(hijaHumoHueso);
        Lehman.getListaLibros().insert(elSenorDeLosAnillos);
        
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
        pantallaPrincipal.setVisible(true);
    }
    
}
