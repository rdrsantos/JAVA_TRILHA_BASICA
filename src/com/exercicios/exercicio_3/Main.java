package com.exercicios.exercicio_3;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializa(10, 13);

        // metodos
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.desce();
    }
}
