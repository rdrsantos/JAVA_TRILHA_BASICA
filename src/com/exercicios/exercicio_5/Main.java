package com.exercicios.exercicio_5;

public class Main {
    public static void main(String[] args) {
        SelecaoCaminhao c = new SelecaoCaminhao();
        try {
            c.selecionarCaminhaoApto();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
