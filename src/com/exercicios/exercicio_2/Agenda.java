package com.exercicios.exercicio_2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private int totalPessoas;

    public void armazenarPessoa(String nome, int idade, float altura){
        if(this.controlePessoas()){
            pessoas.add(new Pessoa(nome, idade, altura));
            totalPessoas++;
        } else {
            System.out.println("Limite de 10 pessoas foi atingido");
        }
    }

    public void removerPessoa(String nome){
        for (int i = 0; i <= pessoas.size() - 1; i++){
            if(nome == pessoas.get(i).getNome()){
                System.out.println(pessoas.get(i).getNome() + " foi excluido");
                pessoas.remove(i);
                return;
            }
        }
        System.out.println("'"+nome+"' " + "não existe na agenda!");
    }

    public void buscarPessoa(String nome){
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for(int i = 0; i <= pessoas.size() - 1; i++){
            if(nome == pessoas.get(i).getNome()){
                resultados.add(i);
            }
        }
        if(resultados.size() > 0){
            for (int resultado : resultados){
                System.out.println(nome + " encontrado(a) na posição " + (resultado + 1) + " da agenda");
            }
        } else {
            System.out.println(nome + " não foi encontrado(a) na agenda");
        }
    }

    public void imprimeAgenda(){
        if(pessoas.size() > 0){
            System.out.println("\n ========AGENDA========== \n");
            for (Pessoa pessoa : pessoas){
                System.out.println("---------------------------- \n" +
                        "Nome: " + pessoa.getNome() + "\n" +
                        "Idade: " + pessoa.getIdade() + "\n" +
                        "Altura: " + pessoa.getAltura()
                );
            }
        } else {
            System.out.println("Nenhuma pessoa cadastrada");
        }

    }

    public void imprimePessoa(int index){
        if(index <= pessoas.size()){
            int posicaoPessoa = index - 1;
            System.out.println("----------------------------- \n" +
                    "RESULTADO DA BUSCA \n\n"+
                    "Nome: " + pessoas.get(posicaoPessoa).getNome() + "\n" +
                    "Idade: " + pessoas.get(posicaoPessoa).getIdade() + "\n" +
                    "Altura: " + pessoas.get(posicaoPessoa).getAltura() + "\n" +
                    "------------------------------"
            );
        } else {
            System.out.println("Posição não disponivel na agenda");
        }


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
