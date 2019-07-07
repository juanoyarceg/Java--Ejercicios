/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes22;

import java.util.Scanner;

/**
 *
 * @author cetecom
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        /*
        Alumno[] curso = new Alumno[10];
        
        for (i=0;i<curso.length;i++){
            curso[i] = new Alumno("Alumno"+(i+1));
        }
        for (i=0;i<curso.length;i++){
            curso[i].mostrar();
        }
*/
        /*
        for(i=0;i<curso.length;i++){
            curso[i]=new Alumno();
            curso[i].setNombre("Alumno "+(i+1));
            curso[i].setNotasRandom();
            curso[i].promediar();
            curso[i].situacion(); 
        }
        for (i=0;i<curso.length;i++){
            curso[i].mostrar();
        }
*/
        Scanner en = new Scanner(System.in);
        Automovil[] autos = new Automovil[3];
        String pat,marc,mod,aux;
        int km,kmaux,indice = 1515;
        for (i=0;i<autos.length;i++){
            
            System.out.println("ingrese datos del auto numero "+(i+1)+":");
            System.out.println("ingrese patente:");
            pat = en.nextLine();
            System.out.println("ingrese marca:");
            marc = en.nextLine();
            System.out.println("ingrese modelo:");
            mod = en.nextLine();
            System.out.println("ingrese kilometros recorridos:");
            km = Integer.parseInt(en.nextLine());
            autos[i] = new Automovil(pat,marc,mod,km);
        }
        //mostrar todos los coches introducidos
        for (i=0;i<autos.length;i++){
            autos[i].mostrar();
        }
        //todos los coches de una marca determinada
        System.out.println("ingrese la marca a listar");
        aux = en.nextLine();
        for (i=0;i<autos.length;i++){
            if (autos[i].getMarca().equals(aux)){
            autos[i].mostrar();
            }
        }
        //listar autos con km maximo
        System.out.println("ingrese la cantidad de kilometros maximo");
        kmaux = Integer.parseInt(en.nextLine());
        for (i=0;i<autos.length;i++){
            if (autos[i].getKmRecorrido()<=kmaux){
            autos[i].mostrar();
            }
        }
        //listar el auto con mayor kilometraje
        kmaux=0;
        System.out.println("ahora se mostrara el auto con mayor kilometraje");
        for (i=0;i<autos.length;i++){
            if (autos[i].getKmRecorrido()>kmaux){
                kmaux=autos[i].getKmRecorrido();
                indice=i;
            }
        }
        if(indice!=1515) {
            autos[indice].mostrar();
        }else{
            System.out.println("No se encontro nada");
        }
        //ordenar
        System.out.println("se mostrara ordenado");
        bubbleSort(autos);
        for (i=0;i<autos.length;i++){
            autos[i].mostrar();
        }
        
        
        
        
        
    
    }
    
    public static void bubbleSort(Automovil[] arr){
        Automovil temp ;
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1].getKmRecorrido() > arr[j].getKmRecorrido()){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                }
            }
        }
    }
}
