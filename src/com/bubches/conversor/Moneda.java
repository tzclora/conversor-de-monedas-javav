package com.bubches.conversor;

public class Moneda {
    private final String codigo;
    private final String pais;

    public Moneda(String codigo, String pais) {
        this.codigo = codigo;
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return codigo + " (" + pais + ")";
    }
}
