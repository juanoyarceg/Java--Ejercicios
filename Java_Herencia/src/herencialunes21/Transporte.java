/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencialunes21;

/**
 *
 * @author cetecom
 */
public class Transporte {
    protected String marca;
    protected String modelo;
    
    
    public Transporte(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
       
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
}
