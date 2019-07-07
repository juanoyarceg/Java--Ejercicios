package ejmjava003;

import java.util.ArrayList;
import java.util.Scanner;

public class EjmJava003 {

    public static void main(String[] args) {
        int opc = 0;
        while (opc < 3) {
            opc = Menu();
            switch(opc){
                case 1: 
                    Listar();
                    break;
                case 2: 
                    Agregar();
                    break;
            }
        }
    }
    
    static public int Menu(){
        System.out.println("Menu");
        System.out.println("1. Listar");
        System.out.println("2. Agregar");
        System.out.println("otro para salir");
        System.out.print("Ingrese OPC : ");
        return LeerEntero();
    }
    
    static public void Agregar(){
        Talleres obj = new Talleres();
        System.out.print("Nombre :");obj.setNombre(LeerCadena());
        System.out.print("Detalle :");obj.setDetalle(LeerCadena());
        System.out.print("Horas :");obj.setHoras(LeerEntero());
        System.out.print("Cupos :");obj.setCupos(LeerEntero());        
        obj.Agregar();
    }

    static public void Listar() {
        Talleres obj = new Talleres();
        ArrayList<Talleres> lista = obj.Listar();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).Mostrar());
        }
    }

    static public String LeerCadena() {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        return cadena;
    }

    static public int LeerEntero() {
        int salida = 0;
        try {
            salida = Integer.parseInt(LeerCadena());
        } catch (Exception ex) {
            salida = 0;
        }
        return salida;
    }
}
