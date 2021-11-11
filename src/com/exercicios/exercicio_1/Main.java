package com.exercicios.exercicio_1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Pessoa rodrigo = new Pessoa("Rodrigo", LocalDate.of(2000, 02, 21), 1.7);
        Pessoa maria = new Pessoa("Maria", LocalDate.of(1999, 02, 21), 1.6);

        System.out.println(rodrigo.apresentar());
        System.out.println();
        System.out.println(maria.apresentar());
    }
}