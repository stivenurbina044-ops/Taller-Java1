package com.taller.repetitivas.ej3;
import java.util.Scanner;

public class Ejercicio3_1_TablaMultiplicarYConteo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero N: ");
        int n = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + n + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %2d = %d%n", n, i, n * i);
        }

        System.out.println("Conteo regresivo:");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}