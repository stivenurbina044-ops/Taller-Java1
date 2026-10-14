package com.taller.repetitivas.ej6;
public class Debug3_BreakIndebido {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // CORRECCIÓN: continue en lugar de break
            }
            System.out.println("Número par procesado: " + i);
        }
    }
}