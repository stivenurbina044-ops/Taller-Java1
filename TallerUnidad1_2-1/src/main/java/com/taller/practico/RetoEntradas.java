package com.taller.practico;

public class RetoEntradas {
    public static void main(String[] args) {
        String tipoEntrada = "ESTUDIANTE";
        double precioBase = 100.0;
        double precioFinal;

        if (tipoEntrada.equals("VIP")) {
            precioFinal = precioBase * 1.10;
        } else if (tipoEntrada.equals("ESTUDIANTE")) {
            precioFinal = precioBase * 0.50;
        } else if (tipoEntrada.equals("ADULTO_MAYOR")) {
            precioFinal = precioBase * 0.60;
        } else {
            precioFinal = precioBase;
        }

        System.out.println("Tipo de entrada: " + tipoEntrada);
        System.out.println("Precio final: $" + precioFinal);
    }
}
