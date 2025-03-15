/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronsinglenton;

/**
 *
 * @author miche
 */
public class PatronSinglenton {

    public static void main(String[] args) {
       Singlenton claseA = Singlenton.obtenerInstancia();
       claseA.MostrarDato();
       claseA.setDato("umg");
       claseA.MostrarDato();
       claseA.MostrarDato();
       
       Singlenton claseB = Singlenton.obtenerInstancia();
       claseB.MostrarDato();
    }
}
