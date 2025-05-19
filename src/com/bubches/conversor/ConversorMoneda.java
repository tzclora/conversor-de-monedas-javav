package com.bubches.conversor;

import java.util.Scanner;

public class ConversorMoneda {

    private final ServicioCambio servicio = new ServicioCambio();
    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        System.out.println("Bienvenido al Conversor de Monedas");

        System.out.print("Ingrese la moneda origen (por ejemplo, USD): ");
        String monedaOrigen = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese la moneda destino (por ejemplo, EUR): ");
        String monedaDestino = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese el monto a convertir: ");
        double cantidad = scanner.nextDouble();

        double resultado = servicio.convertir(monedaOrigen, monedaDestino, cantidad);
        System.out.println("Resultado: " + resultado + " " + monedaDestino);
    }
}
