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
public abstract class SisOperativos {
    
    protected Procesos proc;

    public SisOperativos(Procesos proc) {
        this.proc = proc;
    }

    public void setProc(Procesos proc) {
        this.proc = proc;
    }
    
    public abstract void realizarProcesos();
    
}
