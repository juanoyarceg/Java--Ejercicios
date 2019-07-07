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
public class Profesor extends Persona {

    private String materia;
    private int añoServicio;

    public Profesor(String nombre, int edad, String materia, int año) {
        super(nombre, edad);
        this.materia = materia;
        this.añoServicio = año;

    }

    public String getMateria() {
        return materia;
    }

    public int getAñoServicio() {
        return añoServicio;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setAñoServicio(int añoServicio) {
        this.añoServicio = añoServicio;
    }

}
