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
        ListaLibrerias listaLibrerias = ListaLibrerias.getInstance(); //Inicializa la instancia de la lista de librerias
        Libreria Lehman = new Libreria("Lehman","Costa Rica","27711475","9am-6pm"); //Crea una nueva libreria
        Libreria Catolica = new Libreria("Catolica"); //Crea una nueva libreria
        Libro hijaHumoHueso = new Libro("Hija de humo y hueso",15,32,"FICCION"); 
        Libro elSenorDeLosAnillos = new Libro("El señor de los anillos",7,123,"FICCION");
        Libro HenrryPutter = new Libro("Henrry Putter",6,54,"Ficcion");
        Lehman.getListaLibros().insert(hijaHumoHueso);
        Lehman.getListaLibros().insert(elSenorDeLosAnillos);
        
        listaLibrerias.append(Lehman);
        Catolica.getListaLibros().insert(HenrryPutter);
        listaLibrerias.append(Catolica);
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
        pantallaPrincipal.setSize(815, 607);
        pantallaPrincipal.setVisible(true);
    }
}