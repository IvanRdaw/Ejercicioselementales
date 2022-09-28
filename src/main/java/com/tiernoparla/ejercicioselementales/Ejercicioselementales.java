package com.tiernoparla.ejercicioselementales;

public class Ejercicioselementales {
    public static void main(String[] args) {
        System.out.println("hola");
        
        // printear nums pares del 1 al 10
        for (int i = 1; i < 11; i=i+1) {
            System.out.println(i); 
        } //for 
        
        // printear nums pares del 1 al 10 detectando impares        
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            } // if
        } // for
        
    } // main
} // ejercicios elementales
