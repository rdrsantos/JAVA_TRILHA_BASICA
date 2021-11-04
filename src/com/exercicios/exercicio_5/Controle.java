package com.exercicios.exercicio_5;

import java.util.Scanner;

public class Controle {
    public static String leString(String msg){
        Scanner leitorString = new Scanner(System.in);
        System.out.print(msg + " ");
        return leitorString.nextLine();
    }

    public static int leInteiro(String msg){
        Scanner leitorInteiro = new Scanner(System.in);
        System.out.print(msg + " ");
        return leitorInteiro.nextInt();
    }
}