package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro frankstein = new Livro();
        Livro werther = new Livro();
        String nomeAtendente;
        double desconto;

        System.out.println("Bem vindo!");
        System.out.println("Qual o seu nome?");
        nomeAtendente = teclado.nextLine();
        System.out.println("Digite o desconto:");
        desconto = Double.parseDouble(teclado.nextLine().replaceAll(",", "."));
        frankstein.nome = "O monstro de Frankstein";
        frankstein.autor = "Mary Shelley";
        frankstein.preco = 36.90;

        werther.nome = "Os Sofrimentos do Jovem Werther";
        werther.autor = "Johan Wolfgang von Goethe";
        werther.preco = 17.90;

        frankstein.aplicaDesconto(desconto);
        frankstein.imprimeDesconto(nomeAtendente);
        werther.aplicaDesconto(desconto);
        werther.imprimeDesconto(nomeAtendente);
    }
}
