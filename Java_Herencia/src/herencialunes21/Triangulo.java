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
public class Triangulo extends Herencia {
    double calcularArea(){
        return (this.ancho * this.alto)/2;
    }
    
    void mostrarTipo(String valor){
        System.out.println("tipo: "+valor);
    }
    
}
