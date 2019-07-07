/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes22;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cetecom
 */
public class Alumno {
    Scanner en = new Scanner(System.in);
    Random ra = new Random();
    private double nota1,nota2,nota3,promedio;
    String nombre, situacion;
    
    public Alumno(){}
    public Alumno(String nombre){
        
        this.nombre=nombre;
        this.nota1=Math.ceil((ra.nextDouble()*5+2)*10)/10;
        this.nota2=Math.ceil((ra.nextDouble()*5+2)*10)/10;
        this.nota3=Math.ceil((ra.nextDouble()*5+2)*10)/10;
        this.promedio = Math.ceil((nota1+nota2+nota3)/3*10)/10;
        if (promedio >=4.0){
            this.situacion="APROBADO";
        }else{
            this.situacion="REPROBADO";
        }
    }
    public double promediar(){
        this.promedio = Math.ceil((nota1+nota2+nota3)/3*10)/10;
        return this.promedio;
        
    }
    
    public String situacion(){
         if (promedio >=4.0){
            return this.situacion="APROBADO";
        }else{
            return this.situacion="REPROBADO";
        }
    }
    
    public void mostrar(){
        System.out.println("Alumno: \t"+this.nombre);
        System.out.println("Nota 1: \t"+this.nota1);
        System.out.println("Nota 2: \t"+this.nota2);
        System.out.println("Nota 3: \t"+this.nota3);
        System.out.println("Promedio: \t"+this.promedio);
        System.out.println("Situacion: \t"+this.situacion);
        System.out.println();
    }
    
    public void setNotas(double n1,double n2,double n3){
        this.nota1=n1;
        this.nota2=n2;
        this.nota3=n3;
    }
    
    public void setNotasMano(){
        
        System.out.println("Inserte nota 1 del alumno "+this.nombre);
        this.nota1 = Double.parseDouble(en.nextLine());
        System.out.println("Inserte nota 2");
        this.nota2 = Double.parseDouble(en.nextLine());
        System.out.println("Inserte nota 3");
        this.nota3 = Double.parseDouble(en.nextLine());
        
    }
    
    public void setNotasRandom(){
        this.nota1=Math.ceil((ra.nextDouble()*5+2)*10)/10;
        this.nota2=Math.ceil((ra.nextDouble()*5+2)*10)/10;
        this.nota3=Math.ceil((ra.nextDouble()*5+2)*10)/10;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSituacion() {
        return situacion;
    }
    
    
    
}
