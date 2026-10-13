package com.taller.practico;

public class RetoNotas {
    public static void main(String[] args) {
        double calificacionFinal = 65.0;
        int porcentajeAsistencia = 75;
        boolean entregoProyectoFinal = true;

        if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80) {
            System.out.println("Aprobado");
        } else if (entregoProyectoFinal && calificacionFinal >= 60.0) {
            System.out.println("Pendiente de Examen Extraordinario");
        } else {
            System.out.println("Reprobado");
        }
    }
}
