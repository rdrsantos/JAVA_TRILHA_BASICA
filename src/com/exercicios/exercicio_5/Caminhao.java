package com.exercicios.exercicio_5;

import java.util.ArrayList;

public class Caminhao {
    private String tipo;
    private ArrayList<Pluviometro> pluviometros = new ArrayList<Pluviometro>();

    public Caminhao(String tipo, ArrayList<Pluviometro> pluviometros){
        this.tipo = tipo;
        this.pluviometros = pluviometros;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Pluviometro> getPluviometros() {
        return this.pluviometros;
    }

    public void setPluviometros(double quantidade) {
        this.pluviometros.add(new Pluviometro(quantidade));
    }

    public double capacidade(){
        double soma = 0;
        for(Pluviometro pluviometro : this.pluviometros){
            soma += pluviometro.getQuantidade();
        }
        return soma;
    }
}
