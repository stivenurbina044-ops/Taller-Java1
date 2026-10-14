package com.taller.repetitivas.ej1;
import java.util.Scanner;

public class Ejercicio1_2_BanderaTransacciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean procesando = true;
        double saldo = 0;
        String causa = "";

        while (procesando) {
            System.out.print("Monto de la transacción: ");
            double monto = sc.nextDouble();
            if (monto < 0) {
                causa = "Monto negativo";
                procesando = false;
            } else {
                saldo += monto;
                if (saldo > 1000000) {
                    causa = "Se superó el límite de $1'000.000";
                    procesando = false;
                }
            }
        }
        System.out.println("Saldo final: $" + saldo);
        System.out.println("Causa de finalización: " + causa);
    }
}