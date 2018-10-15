/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0205.Caso3_Bridge;

/**
 *
 * @author Monserrath
 */
public class Windows extends SisOperativos{

    public Windows(Procesos proc) {
        super(proc);
    }

    @Override
    public void realizarProcesos() {
        System.out.println("Windows");
        proc.proceso();
    }
    
}
