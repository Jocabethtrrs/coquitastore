/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coquitastore.datos;

/**
 *
 * @author Toshiba
 */
public class OperacionesMatematicas {
    
    public void operacionesBasicas (double num1, double num2)
     {
        double suma=num1+num2;
        double resta=num1-num2;
        double multi=num1*num2;
        double division=num1/num2;
        
          System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
          System.out.println("La resta de " + num1 + " -  " + num2 + " es: " + resta);
          System.out.println("La multi de " + num1 + " * " + num2 + " es: " + multi);
          System.out.println("La divsion de " + num1 + " / " + num2 + " es: " + division);                
    }
    
    
    
    public void operacionSuma(double num1, double num2){
        double result=num1+num2;
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + result);
        
  
    }
    
        public void operacionResta(double num1, double num2){
        double result=num1-num2;
        
        System.out.println("La Resta de " + num1 + " - " + num2 + " es: " + result);
        
  
    }
    
        public void operacionMulti(double num1, double num2){
        double result=num1*num2;
        
        System.out.println("La Multi de " + num1 + " * " + num2 + " es: " + result);
        
  
    }
        
        public void operacionDivision(double num1, double num2){
        double result=num1*num2;
        
        System.out.println("La Division de " + num1 + " / " + num2 + " es: " + result);
        
  
    }
}
