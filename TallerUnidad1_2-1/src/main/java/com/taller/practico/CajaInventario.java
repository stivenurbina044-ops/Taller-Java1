package com.taller.practico;

public class CajaInventario {
    public static void main(String[] args) {
        int cantidad = 3;
        String tipoCliente = "VIP";
        String cupon = "PROMO1 año";

        double subtotal = cantidad * 250.0;
        double porcentajeDescuento;

        switch (tipoCliente) {
            case "VIP":
                porcentajeDescuento = 0.20;
                break;
            case "REGULAR":
                porcentajeDescuento = 0.10;
                break;
            case "NUEVO":
                porcentajeDescuento = 0.05;
                break;
            default:
                porcentajeDescuento = 0.0;
        }

        double descuentoCliente = subtotal * porcentajeDescuento;
        double subtotalConDescuento = subtotal - descuentoCliente;

        double descuentoCupon = 0.0;
        if (cupon.equals("PROMO1 año") && subtotalConDescuento >= 500.0) {
            descuentoCupon = 50.0;
        }

        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double total = baseImponible + iva;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento cliente: $" + descuentoCliente);
        System.out.println("Descuento cupón: $" + descuentoCupon);
        System.out.println("IVA: $" + iva);
        System.out.println("Total a pagar: $" + total);
    }
}
