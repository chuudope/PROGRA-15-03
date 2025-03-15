/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patron;

/**
 *
 * @author miche
 */
public class Pizza {
    
    private String masa;
    private String salsa;
    private String queso;
    private boolean aceitunas;
    private boolean peperoni;

    private Pizza() {}

    public void mostrarPizza() {
        System.out.println("Pizza con: ");
        System.out.println("- Masa: " + masa);
        System.out.println("- Salsa: " + salsa);
        System.out.println("- Queso: " + queso);
        System.out.println("- Aceitunas: " + (aceitunas ? "Sí" : "No"));
        System.out.println("- Peperoni: " + (peperoni ? "Sí" : "No"));
    }

    public static class PizzaBuilder {

        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder conMasa(String masa) {
            pizza.masa = masa;
            return this;
        }
            
       public PizzaBuilder conSalsa(String salsa) {
            pizza.salsa = salsa;
            return this;
        }

        public PizzaBuilder conQueso(String queso) {
            pizza.queso = queso;
            return this;
        }

        public PizzaBuilder conAceitunas() {
            pizza.aceitunas = true;
            return this;
        }
        
        public PizzaBuilder conPeperoni() {
            pizza.peperoni = true;
            return this;
        }
        
        public Pizza construir(){
            return pizza;
        }
    }
    
}