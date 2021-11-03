package com.exercicios.exercicio_4;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);

        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.diminuirCanal();
        controle.diminuirCanal();
        controle.diminuirCanal();
        controle.diminuirCanal();
        controle.aumentarCanal();
        controle.consultar();


    }
}
