/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilasejemplo;

import java.util.Stack;

/**
 *
 * @author miche
 */
public class Pilasejemplo {

    public static void main(String[] args) {
       Stack<Integer> pila = new Stack <>();
       pila.push(10);
       System.out.println("Agregando el 10");
       pila.push(20);
       System.out.println("Agregando el 20");
       pila.push(30);
       System.out.println("Agregando el 30");
       
       //tamaño de la pila
       System.out.println("El tamaño de la pila es: "+ pila.size());
       //devuelve
       System.out.println("Top de los elementos: "+ pila.peek());
       
       System.out.println("Eliminado el elemento de la pila"+ pila.pop());
       
       System.out.println("Los datos de la pila son: "+ pila);
       
    }
}
