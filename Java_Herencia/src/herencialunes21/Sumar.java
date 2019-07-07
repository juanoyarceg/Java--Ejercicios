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
public class Sumar extends Operacion {
    double suma;
    
    public Sumar(double n1, double n2) {
        super(n1, n2, '+');
        this.suma=n1+n2;
        this.setResultado(this.suma);
       
    }
    
    
}
