package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String... args) {
        System.out.println("Jogo da adivinhação");
        System.out.println("Estou pensando em um numero de 1 á 5");
        System.out.println("Em qual numero estou pensando?");
        Scanner teclado = new Scanner(System.in);
        String res;
        int nJogador = parseInt(teclado.nextLine());
        int nGenio =  (int) (1 + Math.random() * (5 - 1));
        if (nJogador == nGenio){
            System.out.println("Acertou Mizeravi");
        }
        else{
            System.out.println("Errouuu");
            System.out.println("Eu pensei no " + nGenio);
        }
        System.out.print("Tentar novamente?(s/n)");
        res = teclado.nextLine();
        if (res.equals("s")) {
            main();
        } else {
            System.out.println("Até a próxima");
        }
    }
}
