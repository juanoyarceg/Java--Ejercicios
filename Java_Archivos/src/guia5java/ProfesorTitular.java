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
public class ProfesorTitular extends Profesor {

    private String otroalgo;

    public ProfesorTitular(String nombre, int edad, String materia, int año, String algo) {
        super(nombre, edad, materia, año);
        this.otroalgo = algo;
    }

    public String getOtroalgo() {
        return otroalgo;
    }

    public void setOtroalgo(String otroalgo) {
        this.otroalgo = otroalgo;
    }

}
