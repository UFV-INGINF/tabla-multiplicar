package org.example;

public class Multiplicador {

    int numero = 5;

    public Multiplicador() {

    }

    public Multiplicador(int numero) {

        this.numero = numero;

    }

    public void multiplicar() {
        for (int i = 1; i < 11; i++) {
            System.out.println(this.numero + " x " + i + " = " + this.numero * i);
        }
    }

}
