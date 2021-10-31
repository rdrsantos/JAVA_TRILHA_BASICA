package com.exercicios.exercicio_2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private int totalPessoas;

    public void armazenaPessoa(String nome, int idade, float altura){
        if(this.controlePessoas()){
            pessoas.add(new Pessoa(nome, idade, altura));
            totalPessoas++;
        } else {
            System.out.println("Limite de 10 pessoas foi atingido");
        }
    }

    public void buscarPessoa(String nome){
        for(int i = 0; i <= pessoas.size() -1; i++){
            if(nome == pessoas.get(i).getNome()){
                System.out.println(pessoas.get(i).getNome() + " = " + i);
                return;
            }
        }
        System.out.println(nome + " não existe na agenda!");
    }

    public void excluirPessoa(String nome){
        for (int i = 0; i <= pessoas.size() - 1; i++){
            if(nome == pessoas.get(i).getNome()){
                System.out.println(pessoas.get(i).getNome() + " foi excluido");
                pessoas.remove(i);
                return;
            }
        }
        System.out.println("'"+nome+"' " + "não existe na agenda!");
    }

    public void imprimeAgenda(){
        System.out.println("\n ========AGENDA========== \n");
        for (Pessoa pessoa : pessoas){
            System.out.println("---------------------------- \n" +
                                "Nome: " + pessoa.getNome() + "\n" +
                                "Idade: " + pessoa.getIdade() + "\n" +
                                "Altura: " + pessoa.getAltura()
            );
        }
    }

    public int total(){
        return pessoas.size();
    }

    private boolean controlePessoas(){
        if(this.totalPessoas == 10){
            return false;
        } else {
            return true;
        }
    }

    public int getTotalPessoas(){
        return totalPessoas;
    }
}
