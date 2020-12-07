/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coquitastore.operacion;

import coquitastore.datos.OperacionesMatematicas;
import java.util.Scanner;


/**
 *
 * @author Toshiba
 */
public class test {
    public static void main(String[] args){
        
        //Instanciar la clase operacionesMatematicas,donde se encuentra las funciones mate.....
        OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
        
        Scanner scanner = new Scanner(System.in);
            
       /**
        * Llamar el metodo de operaciones basicas,para resolver dos numeros...
        * Aqui puedes seguir comentando
        * bla bla 
        * bla
        * 
        */
       // operacionesMatematicas.operacionesBasicas(421312,43212);
       
       
        for (int i = 0; i < 10; i++) {
            
      System.out.println("******    OPERACIONES MATEMATICAS *****");
      System.out.println("******    ITERACION NO." + i +" *****");
      
       System.out.println("introduce el primer valor:");       
       double priValue=scanner.nextDouble();
        System.out.println("introduce el segundo valor:");
       double secValue=scanner.nextByte();
       
       operacionesMatematicas.operacionesBasicas(priValue,secValue);
            
        }
       
       
        



    }
    
}
