package com.taller.practico;

public class RetoTernario {
    public static void main(String[] args) {
        boolean cookieSesionActiva = true;
        String estadoConexion = cookieSesionActiva ? "ACTIVA" : "INACTIVA";

        System.out.println(estadoConexion);
    }
}
