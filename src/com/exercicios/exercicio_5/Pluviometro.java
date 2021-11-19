package com.exercicios.exercicio_5;

public class Pluviometro {
    private double quantidade;

    public Pluviometro(double quantidade){
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return ""+this.getQuantidade();
    }
}
