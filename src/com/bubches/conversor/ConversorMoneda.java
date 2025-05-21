package com.bubches.conversor;

import java.util.*;

public class ConversorMoneda {
    private static final Map<Integer, String> MONEDAS = new HashMap<>();

    static {
        MONEDAS.put(1, "USD");// Dólar estadounidense
        MONEDAS.put(2, "BOB"); // Peso boliviano
        MONEDAS.put(3, "BRL"); // Real brasileño
        MONEDAS.put(4, "ARS"); // Peso argentino
        MONEDAS.put(5, "MXN"); // Peso mexicano
        MONEDAS.put(6, "COP"); // Peso colombiano
        MONEDAS.put(7, "CLP");//Peso chileno
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        ServicioCambio servicio = new ServicioCambio();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Conversor de Monedas ===");
            mostrarOpciones();

            System.out.print("Selecciona la moneda ORIGEN (número): ");
            int opcionOrigen = scanner.nextInt();

            System.out.print("Selecciona la moneda DESTINO (número): ");
            int opcionDestino = scanner.nextInt();

            System.out.print("Cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            String codigoOrigen = MONEDAS.get(opcionOrigen);
            String codigoDestino = MONEDAS.get(opcionDestino);

            if (codigoOrigen == null || codigoDestino == null) {
                System.out.println("⚠️ Moneda no válida.");
                continue;
            }

            double resultado = servicio.convertir(codigoOrigen, codigoDestino, cantidad);
            System.out.println("💱 " + cantidad + " " + codigoOrigen + " = " + resultado + " " + codigoDestino);

            System.out.print("\n¿Deseas hacer otra conversión? (s/n): ");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("¡Gracias por usar el conversor!");
    }


    private void mostrarOpciones() {
        System.out.println("Monedas disponibles:");
        for (Map.Entry<Integer, String> entrada : MONEDAS.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
