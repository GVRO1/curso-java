package com.company;

public class Livro {
    String nome;
    String autor;
    double preco;

    void aplicaDesconto(double descontoLivro){
        preco *= (1 - descontoLivro);
    }

    void imprimeDesconto(String nomeAtendente){
        System.out.printf("Olá %s, consegui o desconto no livro '%s' do autor '%s' por R$%.2f \n", nomeAtendente , nome, autor, preco);
    }

}
