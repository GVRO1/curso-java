package com.company;

import java.util.Scanner;

public class Main {
    static int contador = 0;
    static float saldo;
    static ContaBanco conta1;
    static boolean status;

    public static void main(String... args) {
        Scanner teclado = new Scanner(System.in);
        int nOpcao;
        int nTipoConta;
        String tipo;
        String nome;

        int valorDeposito;
        String confirmacao;
        String continuar;

        if (contador == 0) {
            tipo = "";
            nome = "";
            status = false;
            valorDeposito = 0;
        }
        contador++;

        System.out.println("Bem vindo ao banco ALPE");
        System.out.println("(1)- Abrir conta");
        System.out.println("(2)- Deposito");
        System.out.println("(3)- Saque");
        System.out.println("(4)- Pagar Mensalidade");
        System.out.println("(5)- Fechar conta");
        System.out.print("Digite o numero correspondente a opção desejada: ");
        nOpcao = teclado.nextInt();
        System.out.println("");

        switch (nOpcao) {
            case 1:
                System.out.println("");
                System.out.println("Abrir conta");
                System.out.println("Qual o tipo da conta");
                System.out.println("(1) CC - Conta Corrente ");
                System.out.println("(2) CP - Conta Poupança ");
                System.out.print("Digite o numero correspondente a opção desejada: ");
                nTipoConta = teclado.nextInt();
                System.out.println("");
                if (nTipoConta == 1) {
                    System.out.println("");
                    System.out.print("Qual o seu nome? ");
                    teclado.nextLine();
                    nome = teclado.nextLine();
                    tipo = "CC";
                    status = true;
                    saldo += 50;
                    conta1 = new ContaBanco(tipo, status, saldo, nome);

                    System.out.printf("%s, sua Conta Corrente foi criada com sucesso\n", nome);
                    System.out.printf("Sua conta é %s \n", conta1.numConta);
                    System.out.printf("Saldo: R$%.2f\n", conta1.getSaldo());
                    System.out.println("Aperte enter para continuar");
                    confirmacao = teclado.nextLine();

                } else if (nTipoConta == 2) {
                    System.out.println("");
                    System.out.print("Qual o seu nome? ");
                    teclado.nextLine();
                    nome = teclado.nextLine();
                    tipo = "CP";
                    status = true;
                    saldo = saldo + 150;
                    conta1 = new ContaBanco(tipo, status, saldo, nome);

                    System.out.printf("%s, sua Conta Poupança foi criada com sucesso\n", nome);
                    System.out.printf("Sua conta é %s \n", conta1.numConta);
                    System.out.printf("Saldo: R$%.2f\n", conta1.getSaldo());
                    System.out.println("Aperte enter para continuar");
                    confirmacao = teclado.nextLine();
                }

                break;

            case 2:
                System.out.println("");
                System.out.println("Deposito Bancário");
                System.out.printf("Saldo Atual: %.2f\n", conta1.getSaldo());
                System.out.print("Qual o valor a ser depositado:");
                valorDeposito = teclado.nextInt();
                teclado.nextLine();
                boolean sucessoDeposito = conta1.depositar(valorDeposito);

                if (sucessoDeposito) {
                    System.out.printf("Saldo Atual: %.2f", conta1.getSaldo());
                    System.out.println("");
                } else {
                    System.out.println("Não é possivel fazer o deposito a conta não está aberta");
                }
                break;
            case 3:
                System.out.println("");
                System.out.println("Saque Bancário");
                System.out.printf("Saldo Atual: %.2f\n", conta1.getSaldo());
                System.out.print("Qual o valor a ser retirado:");
                int valorSaque = teclado.nextInt();
                teclado.nextLine();
                String msg = conta1.sacar(valorSaque);
                if (msg.equals("true")) {
                    System.out.printf("Saldo Atual: %.2f", conta1.getSaldo());
                    System.out.println("");
                } else {
                    System.out.println(msg);
                }
                break;
        }

        System.out.println("Deseja continuar?(S/N)");
        continuar = teclado.nextLine();
        if (continuar.equals("s")) {
            main();
        } else {
            System.out.println("Obrigado por usar os serviços da Alpe");
            System.out.println("   Alpe, vamos crescer juntos?");
        }

    }
}
