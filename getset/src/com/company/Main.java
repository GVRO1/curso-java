package com.company;

import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String time;
        String selecao;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);

        System.out.println("Qual time você torce?");
        time = texto.nextLine();

//        System.out.println("Qual a selecao que você torce?");
//        selecao = texto.nextLine();

        torcida.setTime(time);
        torcida.mostraTime();

//        torcida.setSelecao(selecao);
        torcida.mostraSelecao();

        Futebol torcida2 = new Futebol();
        torcida2.mostraTime();
        torcida2.mostraSelecao();

        torcida2.setSelecao("japonesa");
        torcida.mostraSelecao();
    }
}











