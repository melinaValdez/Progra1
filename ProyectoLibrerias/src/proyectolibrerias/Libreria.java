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
public class Libreria {
    private String nombre;
    private String pais;
    private String ubicacion;
    private String telefono;
    private String horario;
    private ListaLibros listaLibros;
    
    //Constructores
    public Libreria(String pNombre){
        nombre = pNombre;
        listaLibros = new ListaLibros();
    }
    public Libreria(String pNombre, String pPais, String pTelefono, String pHorario){
        nombre = pNombre.toUpperCase();
        pais = pPais.toUpperCase();
        telefono = pTelefono.toUpperCase();
        horario = pHorario.toUpperCase();
        listaLibros = new ListaLibros();
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ListaLibros getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ListaLibros listaLibros) {
        this.listaLibros = listaLibros;
    }
}
