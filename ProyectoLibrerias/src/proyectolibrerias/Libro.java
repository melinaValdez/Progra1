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
public class Libro {
    public static int issn;
    public String nombre;
    public String descripcion;
    public int cantVendida;
    public int cantDisponible;
    public int precio;
    public String tema;
    
    //Constructor
    public Libro(String pNombre, int pPrecio, int pCantDisponible, String pTema){
        issn++;
        nombre = pNombre.toLowerCase();
        precio = pPrecio;
        cantDisponible = pCantDisponible;
        tema = pTema.toLowerCase();
    }

    public Libro() {
    }
    
    
    
    
    //Getters y setters
    public static int getIssn() {
        return issn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantVendida() {
        return cantVendida;
    }

    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
}
