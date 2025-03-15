/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronsinglenton;

/**
 *
 * @author miche
 */
public class Singlenton {
    private static Singlenton instancia;
    
    private String dato;
    
    public Singlenton(){
        
        dato = "Soy una instancia unica";
    }
    
    public static Singlenton obtenerInstancia(){
        
        if(instancia==null){
            
            instancia = new Singlenton();
        }
        return instancia;
    }
    
    public void MostrarDato(){
        
        System.out.println(dato);
    }
    
    public void setDato(String nuevoDato){
        
        System.out.println(dato);
        
    }
    
    
            
    
}
