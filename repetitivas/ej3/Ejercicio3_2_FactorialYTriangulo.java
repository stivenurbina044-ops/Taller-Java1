package com.taller.repetitivas.ej3;
import java.util.Scanner;

public class Ejercicio3_2_FactorialYTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un entero positivo N (máx. 20): ");
        int n = sc.nextInt();

        // Parte A: factorial (long evita desbordamiento hasta 20!)
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);

        // Parte B: triángulo
        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}