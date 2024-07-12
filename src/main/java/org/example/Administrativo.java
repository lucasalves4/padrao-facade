package org.example;

public class Administrativo extends Setor {

    private static Administrativo administrativo = new Administrativo();

    private Administrativo() {};

    public static Administrativo getInstancia() {
        return administrativo;
    }
}
