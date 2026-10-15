package com.educacion.ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int MAX_INTENTOS = 6;
    static final String[] PALABRAS = {"JAVA", "VARIABLE", "BUCLE", "STRING", "CONSOLA", "OBJETO", "METODO"};
    static final Scanner sc = new Scanner(System.in);

    static int partidas = 0, victorias = 0, derrotas = 0;
    static double puntajeTotal = 0.0;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===== AHORCADO DE CONSOLA =====");
            System.out.println("1. Jugar");
            System.out.println("2. Ver Estadísticas");
            System.out.println("3. Salir");
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    verEstadisticas();
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
        } while (opcion != 3);
    }

    // Validación con while + Integer.parseInt
    static int leerOpcion() {
        while (true) {
            System.out.print("Elija una opción (1-3): ");
            String linea = sc.nextLine().trim();
            try {
                int op = Integer.parseInt(linea);
                if (op >= 1 && op <= 3) {
                    return op;
                }
                System.out.println("Error: la opción debe estar entre 1 y 3.");
            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese solo números (1, 2 o 3).");
            }
        }
    }

    static void jugar() {
        // Registro y normalización del nombre
        String nombreJugador;
        do {
            System.out.print("Ingrese su nombre: ");
            nombreJugador = sc.nextLine().trim().toUpperCase();
            if (nombreJugador.length() == 0) {
                System.out.println("El nombre no puede estar vacío.");
            }
        } while (nombreJugador.length() == 0);

        // Variables de estado
        int intentosRestantes = MAX_INTENTOS;
        double puntaje = 100.0;
        boolean juegoGanado = false;
        char ultimaLetra;
        int aciertos = 0, fallos = 0;

        String secreta = PALABRAS[new Random().nextInt(PALABRAS.length)];

        // Máscara dinámica: "_ _ _ _"
        StringBuilder mascara = new StringBuilder();
        for (int i = 0; i < secreta.length(); i++) {
            mascara.append("_ ");
        }
        StringBuilder historial = new StringBuilder();

        while (intentosRestantes > 0 && !juegoGanado) {
            System.out.println("\nPalabra: " + mascara);
            System.out.println("Letras usadas: " + historial);
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Ingrese una letra (o 'rendirse'): ");
            String entrada = sc.nextLine().trim();

            if (entrada.length() == 0) {
                System.out.println("Entrada vacía, intente de nuevo.");
                continue;
            }
            if (entrada.equalsIgnoreCase("rendirse")) {
                System.out.println("Te has rendido.");
                break;
            }

            ultimaLetra = Character.toUpperCase(entrada.charAt(0));
            if (!Character.isLetter(ultimaLetra)) {
                System.out.println("Carácter inválido, ingrese una letra.");
                continue;
            }
            if (historial.indexOf(String.valueOf(ultimaLetra)) >= 0) {
                System.out.println("Ya usaste la letra " + ultimaLetra + ".");
                continue;
            }
            historial.append(ultimaLetra).append(' ');

            // Buscar coincidencias y actualizar la máscara
            boolean acierto = false;
            for (int i = 0; i < secreta.length(); i++) {
                if (String.valueOf(secreta.charAt(i)).equalsIgnoreCase(String.valueOf(ultimaLetra))) {
                    mascara.setCharAt(i * 2, ultimaLetra);
                    acierto = true;
                }
            }

            if (acierto) {
                aciertos++;
            } else {
                fallos++;
                intentosRestantes--;
            }
            System.out.println(acierto ? "¡Acierto! La letra " + ultimaLetra + " está en la palabra."
                    : "Fallaste. La letra " + ultimaLetra + " no está.");

            if (mascara.indexOf("_") < 0) {
                juegoGanado = true;
                break;
            }
        }

        // Cálculos (casting a double para evitar división entera)
        int totalJugadas = aciertos + fallos;
        double porcentaje = totalJugadas == 0 ? 0.0 : (double) aciertos / totalJugadas * 100;
        puntaje = juegoGanado ? 100.0 + intentosRestantes * 12.5 : 0.0;

        partidas++;
        puntajeTotal += puntaje;
        if (juegoGanado) victorias++; else derrotas++;

        String estado = juegoGanado ? "¡VICTORIA!" : "DERROTA";

        System.out.printf("%n====================================================%n");
        System.out.printf("RESUMEN DE LA PARTIDA%n");
        System.out.printf("====================================================%n");
        System.out.printf("%-20s %s%n", "Jugador:", nombreJugador);
        System.out.printf("%-20s %s%n", "Estado Final:", estado);
        System.out.printf("%-20s %s%n", "Palabra Secreta:", secreta);
        System.out.printf("%-20s %d / %d%n", "Intentos Restantes:", intentosRestantes, MAX_INTENTOS);
        System.out.printf("%-20s %.2f%%%n", "Porcentaje Aciertos:", porcentaje);
        System.out.printf("%-20s %.2f pts%n", "Puntaje Final:", puntaje);
        System.out.printf("====================================================%n");
    }

    static void verEstadisticas() {
        System.out.printf("%n%-20s %d%n", "Partidas jugadas:", partidas);
        System.out.printf("%-20s %d%n", "Victorias:", victorias);
        System.out.printf("%-20s %d%n", "Derrotas:", derrotas);
        System.out.printf("%-20s %.2f pts%n", "Puntaje acumulado:", puntajeTotal);
    }
}