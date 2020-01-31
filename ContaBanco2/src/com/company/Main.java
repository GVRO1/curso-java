package com.company;

public class Main {

    public static void main(String[] args) {


        ContaBanco conta = ContaBanco.abrirConta("Gabriel", "0111", "CC");
        System.out.println(conta.depositar(100f));
        System.out.println(conta.sacar(50f));
        System.out.println(conta.pagarMensal());
        System.out.println(conta.fecharConta());
        System.out.printf("Contas Abertas: %d\n", ContaBanco.qtdContas);
        ContaBanco conta1 = ContaBanco.abrirConta("Gabriel", "0111", "CC");
        System.out.println(conta1.depositar(100f));
        System.out.println(conta1.sacar(50f));
        System.out.println(conta1.pagarMensal());
        System.out.println(conta1.fecharConta());
        System.out.printf("Contas Abertas: %d\n", ContaBanco.qtdContas);
        conta.dadosContas();
        conta1.dadosContas();
    }
}
