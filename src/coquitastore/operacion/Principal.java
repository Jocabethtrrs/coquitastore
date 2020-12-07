/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coquitastore.operacion;

import coquitastore.datos.Saludar;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Principal {
    public static void main (String [] args){
        
         
         for (int i = 0; i < 10; i++){
              Scanner scanner = new Scanner(System.in);
         Saludar saludar=new Saludar();
             
         System.out.println("Introduce tu nombre:");
         String nombre=scanner.nextLine().toUpperCase();
         System.out.println("Introduce tu genero - F=femenino M=Masculino:");
         String genero=(scanner.nextLine()).toUpperCase();
         System.out.println("Introduce tu edad:");
         int edad= scanner.nextInt();
         
         saludar.saludarCliente(nombre, edad, genero);
         

         
    }
    }
    
}
