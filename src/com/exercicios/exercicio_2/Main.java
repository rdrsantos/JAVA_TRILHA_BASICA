package com.exercicios.exercicio_2;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenarPessoa("Rodrigo", 21, 1.7f);
        agenda.armazenarPessoa("João", 13, 1.3f);
        agenda.armazenarPessoa("Maria", 30, 1.65f);
        agenda.armazenarPessoa("Paulo", 16, 1.8f);
        agenda.armazenarPessoa("Alex", 103, 1.7f);
        agenda.armazenarPessoa("José Silva", 25, 1.9f);
        agenda.armazenarPessoa("Debora", 38, 1.6f);
        agenda.armazenarPessoa("Kaira", 30, 1.75f);
        agenda.armazenarPessoa("Roberto", 50, 1.8f);
        agenda.armazenarPessoa("Marta", 29, 1.6f);

        //metodos
        agenda.imprimeAgenda();
//        agenda.removerPessoa("Alex");
//        agenda.buscarPessoa("Alex");
//        System.out.println(agenda.buscarPessoa("Marta"));
//        agenda.imprimePessoa(4);
}
}