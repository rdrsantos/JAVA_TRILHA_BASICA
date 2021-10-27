package com.exercicio1;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento, double altura){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String apresentar(){
        return "Nome: " + this.getNome() + "\n" +
                "Data de Nascimento: " + this.getDataNascimento() + "\n" +
                "Altura: " + this.getAltura() + "\n" +
                "Idade: " + getIdade();
    }

    public int getIdade(){
        String dataNascimentoArray[] = this.dataNascimento.split("/");
        int dataComTraco = this.dataNascimento.indexOf("-");

        if (dataComTraco >= 0){ //verifica se a data veio no padrao ""00-00-0000"
            dataNascimentoArray = this.dataNascimento.split("-");
        }

        int anoNascimento = Integer.parseInt(dataNascimentoArray[dataNascimentoArray.length-1]);
        Calendar data = Calendar.getInstance();
        int anoAtual = data.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
