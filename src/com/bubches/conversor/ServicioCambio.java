package com.bubches.conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicioCambio {


    private final String API_KEY = "d645373d6b0f9fbe7369264c";

    public double convertir(String desde, String hacia, double cantidad) {
        String urlStr = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + desde + "/" + hacia + "/" + cantidad;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            Reader reader = new InputStreamReader(conexion.getInputStream());
            JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();

            if (json.get("result").getAsString().equals("success")) {
                return json.get("conversion_result").getAsDouble();
            } else {
                System.out.println("Error en la respuesta de la API: " + json);
                return 0.0;
            }

        } catch (Exception e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return 0.0;
        }
    }
}


