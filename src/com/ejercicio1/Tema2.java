package com.ejercicio1;

import java.util.Scanner;
public class Tema2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de precio" );
        int precio = sc.nextInt();
        double iva = 0.21;
        double precioTotal = precio + (precio * iva);
        System.out.println("El precio total es: " + precioTotal);

    }
}
