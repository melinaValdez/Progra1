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
public class Cliente {
    String cedula;
    String nombre;
    String direccion;
    String telefono;
    String correo;
    ListaDoble listaPedidos;
    public Cliente(String cedula, String nombre, String direccion, String telefono, String correo) {
            this.cedula = cedula.toUpperCase();
            this.nombre = nombre.toUpperCase();
            this.direccion = direccion.toUpperCase();
            this.telefono = telefono.toUpperCase();
            this.correo = correo.toUpperCase();
            listaPedidos = new ListaDoble();
    }

    public Cliente(String cedula, String nombre, String direccion, String correo) {
            this.cedula = cedula.toUpperCase();
            this.nombre = nombre.toUpperCase();
            this.direccion = direccion.toUpperCase();
            this.correo = correo.toUpperCase();
            listaPedidos = new ListaDoble();
    }

    public String getCedula() {
            return cedula;
    }
    public void setCedula(String cedula) {
            this.cedula = cedula;
    }
    public String getNombre() {
            return nombre;
    }
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    public String getDireccion() {
            return direccion;
    }
    public void setDireccion(String direccion) {
            this.direccion = direccion;
    }
    public String getTelefono() {
            return telefono;
    }
    public void setTelefono(String telefono) {
            this.telefono = telefono;
    }
    public String getCorreo() {
            return correo;
    }
    public void setCorreo(String correo) {
            this.correo = correo;
    }
}
