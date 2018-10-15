/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package iiexamengrupo0205.Caso1_Factory; 
 
/** 
 * 
 * @author Luis 
 */ 
public class GarroteSauron extends Arma { 
   
      private int ataque; 
    private int magia; 
 
    public GarroteSauron(int ataque, int magia) { 
        this.ataque = ataque; 
        this.magia = magia; 
    } 
     
     @Override 
    public void imprimirAtributos() { 
         System.out.println("GarroteSauron creado: ataque "+ Integer.toString(ataque) + " magia " + Integer.toString(magia)); 
    } 
} 
