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
public class Saludar {
    
    public void saludarCliente (String nombre, int edad, String genero){
        System.out.println("Nombre="+nombre+" edad="+edad + " genero=" + genero);
        System.out.println("Bienvenido "+nombre+" a coquitastore");
        ofrecerPromocion (edad, genero);
    }
    
     public void ofrecerPromocion ( int edad, String genero){
         if (edad>0 &&edad<=10 &&genero.equals("F")) {
             System.out.println("Tenemos para ti unos pañales de dora exploradora por $149.00 pesos");
             
         }
         else if (edad>0 &&edad<=10 &&genero.equals("M")) {
              System.out.println("Tenemos para ti unos pañales de mackuin por $149.00 pesos");
             
         }
          else if (edad>10 &&edad<=15 &&genero.equals("F")) {
              System.out.println("Tenemos para ti unos tenis nike por $2500.00");
             
         }
         else if (edad>10 &&edad<=15 &&genero.equals("M")) {
              System.out.println("Tenemos para ti unas sudaderas de the neigbourhood por $1500.00");
             
         }
         
          else if (edad>15 &&edad<=25 &&genero.equals("F")) {
              System.out.println("Tenemos para ti unas zapatillas por $120.00");
             
         }
         
          else if (edad>15 &&edad<=25 &&genero.equals("M")) {
              System.out.println("Tenemos para ti unos pantalones jeans por $145.00");
             
         }
         
          else if (edad>25 &&edad<=50 &&genero.equals("F")) {
              System.out.println("Tenemos para ti una estufa por $450.00");
             
         }
           else if (edad>25 &&edad<=50 &&genero.equals("M")) {
              System.out.println("Tenemos para ti unas bicicletas por $600.00"); 
             
         }
           else {
               System.out.println("Tomate un cafe con pan");
           }
    }
    
    
}
