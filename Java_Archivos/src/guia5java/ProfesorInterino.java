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
public class ProfesorInterino extends Profesor {

    private String algo;

    public ProfesorInterino(String nombre, int edad, String materia, int año, String algo) {
        super(nombre, edad, materia, año);
        this.algo = algo;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }
}
