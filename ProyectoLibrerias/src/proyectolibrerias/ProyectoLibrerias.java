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
public class ProyectoLibrerias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple listaLibrerias = ListaSimple.getLibrariesInstance(); //Inicializa la instancia de la lista de librerias
        ListaSimple listaClientes = ListaSimple.getClientsInstance(); //Inicializa la instancia de la lista de clientes
        //Crea dos nuevas librerias con las cuales comenzar el programa
        Libreria Lehman = new Libreria("Lehman","Costa Rica","27711475","9am-6pm");
        Libreria Catolica = new Libreria("Catolica");
        //Crea nuevos libros
        Libro hijaHumoHueso = new Libro("Hija de humo y hueso",15,32,"FICCION"); 
        Libro elSenorDeLosAnillos = new Libro("El señor de los anillos",7,123,"FICCION");
        Libro henrryPutter = new Libro("Henrry Putter",6,54,"Ficcion");
        Libro donQuijote = new Libro("Don Quijote de la Mancha",12,101,"literatura");
        Libro losMiserables = new Libro("Los miserables",16,23,"Historia");
        //Inserta los libros en sus respectivas librerias
        Lehman.getListaLibros().insert(hijaHumoHueso);
        Lehman.getListaLibros().insert(elSenorDeLosAnillos);
        Lehman.getListaLibros().insert(henrryPutter);
        Catolica.getListaLibros().insert(donQuijote);
        Catolica.getListaLibros().insert(losMiserables);
        //Agrega las librerias a la lista
        listaLibrerias.append(Lehman);
        listaLibrerias.append(Catolica);
        //Llama al JFrame de la pantalla principal
        new PantallaPrincipal().setVisible(true);
    }
}