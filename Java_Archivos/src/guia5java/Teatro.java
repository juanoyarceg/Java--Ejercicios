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
public class Teatro {

    private String nombre;
    private String direccion;
    private int obras;

    public Teatro(String nombre, String dir) {
        this.nombre = nombre;
        this.direccion = dir;
        this.obras = 4;
    }

    //setters
    public void setNombre(String nomb) {
        this.nombre = nomb;
    }

    public void setDireccion(String dir) {
        this.direccion = dir;
    }

    public void setObras(int obra) {
        this.obras = obra;
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getObras() {
        return this.obras;
    }
}
