package com.taller.repetitivas.ej5;
import java.util.Scanner;

public class EjercicioIntegrador_ControlInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CAPACIDAD = 500;
        int totalUnidades = 0, totalProductos = 0;
        double valorInventario = 0;
        int opcion;

        do {
            System.out.println("\n1. Registrar Lote de Productos");
            System.out.println("2. Ver Estado del Almacén");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad de productos del lote: ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.print("Producto " + i + " ¿descontinuado? (s/n): ");
                        String desc = sc.next();
                        if (desc.equalsIgnoreCase("s")) {
                            continue;
                        }

                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();
                        while (precio <= 0) {
                            System.out.print("Debe ser mayor a 0. Precio: ");
                            precio = sc.nextDouble();
                        }

                        System.out.print("Cantidad en stock: ");
                        int stock = sc.nextInt();
                        while (stock <= 0) {
                            System.out.print("Debe ser mayor a 0. Stock: ");
                            stock = sc.nextInt();
                        }

                        totalUnidades += stock;
                        totalProductos++;
                        valorInventario += precio * stock;

                        if (totalUnidades > CAPACIDAD) {
                            System.out.println("¡ALERTA! Sobrecupo del almacén. Se aborta el lote.");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Productos registrados: " + totalProductos);
                    System.out.println("Unidades totales: " + totalUnidades + " / " + CAPACIDAD);
                    System.out.println("Valor del inventario: $" + valorInventario);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}