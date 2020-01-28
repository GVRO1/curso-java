package com.example.demo;

import java.util.Scanner;

public class Pessoa {
    //  Define as variaveis com seus tipos da classe greeting
    private final long id;
    private final String nome;
    private final String idade;
    private final String endereco;
    private final ContaBancaria conta;

    // Define pos parametros que o Greeting irá utilizar
    //O nome disso é um construtor """""METODO""""
    public Pessoa(long id) {
        this.id = id;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        this.nome = teclado.nextLine();

        System.out.println("Qual o sua idade?");
        this.idade = teclado.nextLine();

        System.out.println("Onde você mora?");
        this.endereco = teclado.nextLine();

        this.conta = new ContaBancaria("21",89);
    }


    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public ContaBancaria getConta() {
        return conta;
    }
}