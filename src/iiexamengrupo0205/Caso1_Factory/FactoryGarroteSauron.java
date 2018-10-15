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
public class FactoryGarroteSauron extends FactoryAbstracto { 
     
    @Override 
    public Arma fabricarArma(int ataque, int magia) { 
        return new GarroteSauron(ataque,magia); 
    } 
} 
