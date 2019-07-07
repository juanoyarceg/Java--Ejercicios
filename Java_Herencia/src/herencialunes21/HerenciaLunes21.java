/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencialunes21;

import java.util.Scanner;

/**
 *
 * @author cetecom
 */
public class HerenciaLunes21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    /*
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        
        t1.ancho = 3.0;
        t1.alto = 3.0;
        t2.ancho = 8.0;
        t2.alto = 12.0;
        
        System.out.println("triangulo1:");
        t1.mostrarTipo("iso");
        t1.Herencia();
        System.out.println("el area es: "+t1.calcularArea());
        System.out.println("----------------");
        System.out.println("triangulo2:");
        t2.mostrarTipo("recto");
        t2.Herencia();
        System.out.println("el area es: "+t2.calcularArea());
*/
    Bicicleta bici = new Bicicleta("oxford","ax1","MTB",1,"ABS");
    System.out.println(bici.toString());
    bici.mostrar();
    
    Operacion s1 = new Sumar(4.0,5.0);
    s1.mostrarRes();
    
    int i,ed;
    String nom;
    Scanner en = new Scanner(System.in);
    
    Persona arreglo[] = new Persona[3];
    for (i=0;i<arreglo.length;i++){
        en = new Scanner(System.in);
        arreglo[i]=new Persona();
        System.out.println("ingrese el nombre");
        nom=en.nextLine();
        arreglo[i].setNombre(nom);
        System.out.println("ingrese edad de "+arreglo[i].getNombre());
        ed=Integer.parseInt(en.nextLine());
        arreglo[i].setEdad(ed);
    }            
    for(i=0;i<arreglo.length;i++){
        arreglo[i].mostrar();
    }
    

    }
    
}
