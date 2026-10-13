package com.taller.practico;

public class SwitchModerno {
    public static void main(String[] args) {
        int dia = 1;

        String jornada = switch (dia) {
            case 1 -> "Lunes: jornada laboral";
            case 2 -> "Martes: jornada laboral";
            case 3 -> "Miércoles: jornada laboral";
            case 4 -> "Jueves: jornada laboral";
            case 5 -> "Viernes: jornada laboral";
            case 6 -> "Sábado: fin de semana";
            case 7 -> "Domingo: fin de semana";
            default -> "Día no válido";
        };

        System.out.println(jornada);
    }
}
