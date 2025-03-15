/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patron;

/**
 *
 * @author miche
 */
public class PATRON {
    public static void main(String[] args) {
        Pizza pizzaCompleta;
        pizzaCompleta = new Pizza.PizzaBuilder()
                .conMasa("delgada")
                .conSalsa("tomate")
                .conQueso("mozzarella")
                .conPeperoni()
                .conAceitunas()
                .construir(); 
        
        Pizza pizzaVegana = new Pizza.PizzaBuilder()
                .conMasa("integral")
                .conSalsa("tomate")
                .conQueso("mozzarella")
                .conPeperoni() 
                .conAceitunas() 
                .construir(); 
        
        System.out.println("Pizza Completa");
        pizzaCompleta.mostrarPizza(); 
        System.out.println("Pizza Vegana");
        pizzaVegana.mostrarPizza(); 
    }
}