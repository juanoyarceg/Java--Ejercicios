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
public class Operacion {
    private double numero1, numero2,resultado;
    private char operacion;
    
    public Operacion(double n1, double n2, char ope){
        this.numero1=n1;
        this.numero2=n2;
        this.operacion=ope;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public char getOperacion() {
        return operacion;
    }
    public void mostrarRes(){
        System.out.println(this.numero1+" "+this.operacion+" "+this.numero2+" = "+this.resultado);
    }
    
    
}
