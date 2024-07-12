package org.example;

public class Logistica extends Setor {

    private static Logistica logistica = new Logistica();

    private Logistica() {};

    public static Logistica getInstancia() {
        return logistica;
    }
}
