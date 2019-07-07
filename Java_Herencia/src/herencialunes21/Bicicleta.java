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
public class Bicicleta extends Transporte {
    private String tipo, freno;
    private int cambio;
    
    
    public Bicicleta(String marca, String modelo, String tipo, int cambio, String freno) {
        
        super(marca, modelo);
        this.tipo = tipo;
        this.cambio=cambio;
        this.freno=freno;
    }

    public void mostrar(){
        System.out.println("marca: "+this.marca);
        System.out.println("modelo: "+this.modelo);
        System.out.println("tipo: "+this.tipo);
        System.out.println("cambios: "+this.cambio);
        System.out.println("freno: "+this.freno);
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "tipo=" + tipo + ", freno=" + freno + ", cambio=" + cambio + '}';
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public void setFreno(String freno) {
        this.freno = freno;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCambio() {
        return cambio;
    }

    public String getFreno() {
        return freno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
}
