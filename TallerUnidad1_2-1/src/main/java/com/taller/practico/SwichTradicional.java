package com.taller.practico;

public class SwichTradicional {
    public static void main(String[] args) {
        int dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Lunes: jornada laboral");
                break;
            case 2:
                System.out.println("Martes: jornada laboral");
                break;
            case 3:
                System.out.println("Miércoles: jornada laboral");
                break;
            case 4:
                System.out.println("Jueves: jornada laboral");
                break;
            case 5:
                System.out.println("Viernes: jornada laboral");
                break;
            case 6:
                System.out.println("Sábado: fin de semana");
                break;
            case 7:
                System.out.println("Domingo: fin de semana");
                break;
            default:
                System.out.println("Día no válido");
        }
    }
}
