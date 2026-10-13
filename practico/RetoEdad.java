package com.taller.practico;

public class RetoEdad {
    public static void main(String[] args) {
        int edadUsuario = 15;

        if (edadUsuario < 12) {
            System.out.println("Infante: requiere tutor de cuenta.");
        } else if (edadUsuario <= 17) {
            System.out.println("Adolescente: acceso restringido a foros comunitarios.");
        } else if (edadUsuario <= 64) {
            System.out.println("Adulto: acceso a funcionalidades estándar.");
        } else {
            System.out.println("Adulto Mayor: acceso con interfaz adaptada.");
        }
    }
}
