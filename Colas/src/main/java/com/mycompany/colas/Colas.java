/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author miche
 */
public class Colas {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.offer( "Primero");
        cola.offer("Segundo");
        cola.offer("Tercero");
        cola.offer("Cuarto");
        cola.offer("Quinto");
        
        System.out.println("Cola Actual" + cola);
        
        String elementoEliminado = cola.poll();
        System.out.println("El elemento eliminado es: " + elementoEliminado);
        System.out.println("La cola despues de eliminar "+ cola);
        System.out.println("Tamaño de la cola"+ cola.size());
        System.out.println("¿La cola está vacía?"+ cola.isEmpty());   
                
                
                
                
                
     
    }
}
