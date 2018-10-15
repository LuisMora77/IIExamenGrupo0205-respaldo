/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package iiexamengrupo0205; 
 

import iiexamengrupo0205.Caso3_Bridge.JVM;
import iiexamengrupo0205.Caso3_Bridge.Unix;
import iiexamengrupo0205.Caso1_Factory.Arma; 
import iiexamengrupo0205.Caso1_Factory.FactoryAbstracto; 
import iiexamengrupo0205.Caso1_Factory.FactoryArmaOrco; 
import iiexamengrupo0205.Caso1_Factory.FactoryDagaElfica; 
import iiexamengrupo0205.Caso1_Factory.FactoryGarroteSauron; 
import iiexamengrupo0205.Caso1_Factory.FactoryHachaEnano; 
import iiexamengrupo0205.Caso3_Bridge.PTS;
import iiexamengrupo0205.Caso3_Bridge.TSTS;
import iiexamengrupo0205.Caso3_Bridge.Windows;
import iiexamengrupo0205.Caso5_Bridge.BubbleSort;
import iiexamengrupo0205.Caso5_Bridge.InsertSort;
import iiexamengrupo0205.Caso5_Bridge.Lista;
import iiexamengrupo0205.Caso5_Bridge.QuickSort;
 
/** 
 * 
 * @author Luis 
 */ 
public class IIExamenGrupo0205 { 
 
    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String[] args) { 
     
         
 //*********************************************************************************************
 //*                                 PRUEBAS DE CASO1_FACTORY                                  *
 //*********************************************************************************************
        System.out.println("************** INICIO CASO1_FACTORY ************** \n");
        
        FactoryAbstracto factoDaga = new FactoryDagaElfica(); 
        Arma daga =factoDaga.fabricarArma(300,600); 
        daga.imprimirAtributos(); 
     
         
        FactoryAbstracto factoOrco = new FactoryArmaOrco(); 
        Arma orco =factoOrco.fabricarArma(800,0); 
        orco.imprimirAtributos(); 
         
        FactoryAbstracto factoSauron = new FactoryGarroteSauron(); 
        Arma garrote =factoSauron.fabricarArma(750,750); 
        garrote.imprimirAtributos(); 
         
        FactoryAbstracto factoHacha = new FactoryHachaEnano(); 
        Arma hacha =factoHacha.fabricarArma(500,200); 
        hacha.imprimirAtributos();
        
        System.out.println("\n************** FIN CASO1_FACTORY **************");
        
 //*********************************************************************************************
 //*                                 PRUEBAS DE CASO3_BRIDGE                                   *
 //*********************************************************************************************
        System.out.println("\n************** INICIO CASO3_BRIDGE **************\n");
        
        PTS pts = new PTS();
        TSTS tsts = new TSTS();
        Windows win = new Windows(pts);
        win.realizarProcesos();
        win.setProc(tsts);
        win.realizarProcesos();
        System.out.println("\n");
        
        Unix unix = new Unix(pts);
        unix.realizarProcesos();
        unix.setProc(tsts);
        unix.realizarProcesos();
        System.out.println("\n");
        
        JVM jvm = new JVM(pts);
        jvm.realizarProcesos();
        jvm.setProc(tsts);
        jvm.realizarProcesos();

        System.out.println("\n************** FIN CASO3_BRIDGE **************");
        
        
 //*********************************************************************************************
 //*                                 PRUEBAS DE CASO5_BRIDGE                                   *
 //*********************************************************************************************
        
        System.out.println("\n************** INICIO CASO5_BRIDGE **************\n");
 
        QuickSort quick = new QuickSort();
        InsertSort insert = new InsertSort();
        BubbleSort bubble = new BubbleSort();
        Lista prueba = new Lista(quick);
        System.out.println("Prueba con QuickSort");
        prueba.ordenar(1);
        prueba.ordenar(0);
        System.out.println("\n");
        
        System.out.println("Prueba con InsertSort");
        prueba.setOrden(insert);
        prueba.ordenar(1);
        prueba.ordenar(0);
        System.out.println("\n");
        
        System.out.println("Prueba con BubbleSort");
        prueba.setOrden(bubble);
        prueba.ordenar(1);
        prueba.ordenar(0);
        
        
        System.out.println("\n************** FIN CASO5_BRIDGE **************");
 
 
    } 
     
} 
