package exercicio2;

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
