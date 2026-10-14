package com.taller.repetitivas.ej1;
import java.util.Scanner;

public class Ejercicio1_1_ContadorCentinela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, contador = 0;

        System.out.print("Ingrese un entero (-99 para terminar): ");
        int n = sc.nextInt();
        while (n != -99) {
            suma += n;
            contador++;
            System.out.print("Ingrese un entero (-99 para terminar): ");
            n = sc.nextInt();
        }
        System.out.println("Total acumulado: " + suma);
        System.out.println("Cantidad de números: " + contador);
    }
}