package com.bubches.conversor;

import java.util.*;

public class ConversorMoneda {
    private static final Map<Integer, Moneda> MONEDAS = new HashMap<>();

    static {
        MONEDAS.put(1, new Moneda("USD", "Dólar estadounidense"));
        MONEDAS.put(2, new Moneda("BOB", "Peso boliviano"));
        MONEDAS.put(3, new Moneda("BRL", "Real brasileño"));
        MONEDAS.put(4, new Moneda("ARS", "Peso argentino"));
        MONEDAS.put(5, new Moneda("MXN", "Peso mexicano"));
        MONEDAS.put(6, new Moneda("COP", "Peso colombiano"));
        MONEDAS.put(7, new Moneda("CLP", "Peso chileno" ));
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        ServicioCambio servicio = new ServicioCambio();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Bienvenidos al Conversor de Monedas ===");
            mostrarOpciones();

            System.out.print("Selecciona la moneda ORIGEN (número): ");
            int opcionOrigen = scanner.nextInt();

            System.out.print("Selecciona la moneda DESTINO (número): ");
            int opcionDestino = scanner.nextInt();

            System.out.print("Cantidad a convertir: ");
            double cantidad = scanner.nextDouble();


            Moneda monedaOrigen = MONEDAS.get(opcionOrigen);
            Moneda monedaDestino = MONEDAS.get(opcionDestino);

            if (monedaOrigen == null || monedaDestino == null) {
                System.out.println("⚠️ Moneda no válida.");
                continue;
            }

            String codigoOrigen = monedaOrigen.getCodigo();
            String codigoDestino = monedaDestino.getCodigo();

            double resultado = servicio.convertir(codigoOrigen, codigoDestino, cantidad);

            System.out.printf("💱 %.2f %s = %.2f %s%n",
                    cantidad, monedaOrigen,
                    resultado, monedaDestino);
            System.out.print("\n¿Deseas hacer otra conversión? (s/n): ");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("¡Gracias por usar el conversor!");
    }


    private void mostrarOpciones() {
        System.out.println("Monedas disponibles:");
        for (Map.Entry<Integer, Moneda> entrada : MONEDAS.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
