package com.exercicios.exercicio_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(String nome, LocalDate dataNascimento, double altura){
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
        Period idade = Period.between(this.dataNascimento, LocalDate.now());
        return idade.getYears();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = this.dataNascimento.format(formatter);
        return format;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
