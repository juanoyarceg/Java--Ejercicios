/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes22;

/**
 *
 * @author cetecom
 */
public class Automovil {
    private String patente, marca, modelo;
    private int kmRecorrido;
    
    public Automovil(){}
    public Automovil(String pat,String marc,String mod, int km){
        this.patente=pat;
        this.marca=marc;
        this.modelo=mod;
        this.kmRecorrido=km;
    }
    public void mostrar(){
        System.out.println("---Auto---");
        System.out.println("Marca: \t"+this.marca);
        System.out.println("Modelo: \t"+this.modelo);
        System.out.println("Patente: \t"+this.patente);
        System.out.println("Odometro: \t"+this.kmRecorrido);
        System.out.println();
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKmRecorrido() {
        return kmRecorrido;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKmRecorrido(int kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }
    
    
}
