package com.exercicios.exercicio_3;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadePessoas;

    public void inicializa(int capacidadeElevador, int totalAndares){
        this.setCapacidadeElevador(capacidadeElevador);
        this.setTotalAndares(totalAndares);

        this.setAndarAtual(0);
        this.setQuantidadePessoas(0);
    }

    public void entra(){
        if(this.quantidadePessoas < this.capacidadeElevador){
            this.setQuantidadePessoas(this.getQuantidadePessoas() + 1);
            System.out.println("Uma pessoa entrou no elevador");
        } else {
            System.out.println("Não há espaço no elevador, por favor aguarde!");
        }
    }

    public void sai(){
        if (this.quantidadePessoas > 0){
            this.setQuantidadePessoas(this.getQuantidadePessoas() - 1);
            System.out.println("Uma pessoa saiu do elevador");
        } else {
            System.out.println("Elevador se encontra vazio!");
        }
    }

    public void sobe(){
        if(this.andarAtual < this.totalAndares){
            System.out.println("Elevador subiu 1 andar. ⬆⬆ " + this.getAndarAtual()+"➡"+(this.getAndarAtual()+1));
            this.setAndarAtual(this.getAndarAtual() + 1);
        } else {
            System.out.println("Elevador está no ultimo andar");
        }
    }

    public void desce() {
        if(this.andarAtual > 0) {
            System.out.println("Elevador desceu um andar. ⬇⬇ " + this.getAndarAtual()+"➡"+(this.getAndarAtual()-1));
            this.setAndarAtual(this.getAndarAtual() - 1);
        } else {
            System.out.println("Elevador está no térreo");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int pessoas) {
        this.quantidadePessoas = pessoas;
    }
}
