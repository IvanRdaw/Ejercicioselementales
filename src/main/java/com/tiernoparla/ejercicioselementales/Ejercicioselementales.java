package com.tiernoparla.ejercicioselementales;
import  java.util.Scanner;
public class Ejercicioselementales {
    public static void main(String[] args) {
        System.out.println("hola");
        
        // printear nums pares del 1 al 10
        for (int i = 1; i < 11; i=i+1) {
            System.out.println(i); 
        } //for 
        
        // printear nums pares del 1 al 10 detectando impares con for        
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            } // if
        } // for
        
        
        // printear nums pares del 1 al 10 detectando impares con while
        int n = 1;
        while (n < 11) {
            if(n%2==0) {
                System.out.println(n);
            } // if
            n++;
        } // while   
        
        
        //Scanner objetos externo, para ello tenemos q exportar en la parte supeior de codigo el Scanner manualmente
        Scanner sc = new Scanner(System.in); //sc es el nombre que yo le pongo al scanner
        int N;
        int D;
        
        System.out.println("Dame N:");
        N = sc.nextInt(); // aqui el usuario pondria el valor que quiera (en este caso lo pondremos nosotros abajo al correr el codigo)    
        System.out.println("Dame D:");
        D = sc.nextInt(); // aqui el usuario pondria el valor que quiera (en este caso lo pondremos nosotros abajo al correr el codigo)  
       
        // while con otro algoritmo de division;
        /*
        int N = 33; estos valores tendrian que poner estas si no tuviesemos el scan de arriba
        int D = 5; estos valores tendrian que poner estas si no tuviesemos el scan de arriba
        */
        int R = N; // R le damos el valor de N para comenzar el algoritmo y obtener la propia R
        int Q = 0; // se le otorga un valor inicial, el cual ira actualizandose en cada operacion ya que abajo poner Q++
        
        while (R >= D){
            R = R - D;
            Q++;
            System.out.println(R); // este print no es necesario (solo para ver evolucion del valor de R)
        } // while
        System.out.println(N == D*Q+R); // este print es el principal y le cual nos indica que es correcto
        
        
    } // main
} // ejercicios elementales
