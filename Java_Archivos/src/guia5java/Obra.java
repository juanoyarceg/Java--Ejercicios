/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5java;

/**
 *
 * @author cetecom
 */
public class Obra {

    private String nombre;
    private int precio;
    private Teatro teatro;

    public Obra(String nom, int precio, Teatro tea) {
        this.nombre = nom;
        this.precio = precio;
        this.teatro = tea;
    }

    public Obra(String nom, int precio) {
        this.nombre = nom;
        this.precio = precio;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTeatro(Teatro tea) {
        this.teatro = tea;
    }

    @Override
    public String toString() {
        return "Obra{" + "nombre=" + nombre + ", precio=" + precio + ", teatro=" + teatro + '}';
    }

}
