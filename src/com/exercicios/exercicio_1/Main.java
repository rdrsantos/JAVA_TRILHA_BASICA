package com.exercicios.exercicio_1;

public class Main {

    public static void main(String[] args) {
        Pessoa rodrigo = new Pessoa("Rodrigo", "21/02/2000", 1.7); // data com separada por /
        Pessoa maria = new Pessoa("Maria", "12-07-1998", 1.6); // data separada por -

        System.out.println(rodrigo.apresentar());
        System.out.println();
        System.out.println(maria.apresentar());
    }
}