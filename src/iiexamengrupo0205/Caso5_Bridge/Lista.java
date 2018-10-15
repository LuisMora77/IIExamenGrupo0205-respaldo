/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0205.Caso5_Bridge;

/**
 *
 * @author Monserrath
 */
public class Lista extends Colecciones {

    public Lista(ISorting orden) {
        super(orden);
    }

    @Override
    public void ordenar(int forma) {
        System.out.println("Lista");
        if(forma == 1){
            orden.ascendente();
        }
        else{
            orden.descendente();
        }
    }
    
}
