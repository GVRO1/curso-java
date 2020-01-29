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
        nOpcao = Integer.parseInt(teclado.nextLine());
        System.out.println("");

        switch (nOpcao) {
            case 1:
                abrirConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                pagarMensalidade();
                break;
            case 5:
                encerrarConta();
                break;
        }
        System.out.println("Deseja fazer outra operação?(S/N)");
        continuar = teclado.nextLine();
        if (continuar.equals("s")) {
            main();
        } else {
            System.out.println("Obrigado por usar os serviços da Alpe");
            System.out.println("   Alpe, vamos crescer juntos?");
        }

    }

    private static void encerrarConta() {
        Scanner teclado = new Scanner(System.in);;
        String confirmacao;
        System.out.println("");
        System.out.println("Fechamento de Conta");
        System.out.println("");
        if (conta1 == null) {
            System.out.println("Não foi possivel encerrar sua conta, ela não está aberta");
            return;
        }
        System.out.println("Dados Bancarios:");
        System.out.printf("Dono da conta: %s \n", conta1.getDono());
        System.out.printf("Nº da conta: %s \n", conta1.numConta);
        System.out.printf("Tipo de conta: %s\n", conta1.getTipo());
        System.out.printf("Saldo: %.2f", conta1.getSaldo());
        System.out.println("");
        System.out.println("Deseja mesmo encerrar sua conta?(S/N)");
        confirmacao = teclado.nextLine();
        if (confirmacao.equals("s")) {
            if (conta1.getSaldo() == 0) {
                boolean retorno = conta1.fecharConta();
                if (retorno) {
                    System.out.println("Conta encerrada com sucesso");
                    return;
                } else {
                    System.out.println("Não foi possivel encerrar sua conta, ela ja está encerrada");
                }
            } else if (conta1.getSaldo() < 0) {
                System.out.println("Não é possivel encerrar a conta, pague sua divida para poder encerrar");
            } else {
                System.out.println("Não é possivel encerrar a conta, retire o dinheiro para poder encerrar");
            }
            return;
        } else {
            return;
        }
    }

    private static void pagarMensalidade() {
        Scanner teclado = new Scanner(System.in);;
        String continuar;
        System.out.println("");
        System.out.println("Pagamento da mensalidade");
        System.out.println("");
        if (conta1 == null) {
            System.out.println("Não é possivel fazer o saque, a conta não está aberta");
            return;
        }
        System.out.printf("Tipo de conta: %s\n", conta1.getTipo());
        System.out.printf("Saldo Atual: R$%.2f\n", conta1.getSaldo());
        if (conta1.tipo.equals("CC")) {
            System.out.println("Valor a ser debitado: R$12,00");
        }
        System.out.print("Confirmar pagamento?(S/N)");
        System.out.println(" ");
        continuar = teclado.nextLine();

        if (continuar.equals("s")) {
            String msgPagarMensal = conta1.pagarMensal();
            if (msgPagarMensal.equals("true")) {
                System.out.println("Pagamento efetuado com sucesso");
                System.out.printf("Saldo Atual: R$%.2f", conta1.getSaldo());
                System.out.println("");
            } else {
                System.out.println(msgPagarMensal);
            }
        }
        return;
    }

    private static void sacar() {
        Scanner teclado = new Scanner(System.in);;
        System.out.println("");
        System.out.println("Saque Bancário");
        System.out.println("");
        if (conta1 == null) {
            System.out.println("Não é possivel fazer o saque, a conta não está aberta");
            return;
        }
        System.out.printf("Saldo Atual: R$%.2f\n", conta1.getSaldo());
        System.out.print("Qual o valor a ser retirado:");
        int valorSaque = Integer.parseInt(teclado.nextLine());
        String msg = conta1.sacar(valorSaque);
        if (msg.equals("true")) {
            System.out.printf("Saldo Atual: R$%.2f", conta1.getSaldo());
            System.out.println("");
        } else {
            System.out.println(msg);
        }
        return;
    }

    private static void depositar() {
        Scanner teclado = new Scanner(System.in);
        int valorDeposito;
        System.out.println("");
        System.out.println("Deposito Bancário");
        System.out.println("");
        if (conta1 == null) {
            System.out.println("");
            System.out.println("Não é possivel fazer o deposito, a conta não está aberta");
            return;
        }

        System.out.printf("Saldo Atual: R$%.2f\n", conta1.getSaldo());
        System.out.print("Qual o valor a ser depositado:");
        valorDeposito = Integer.parseInt(teclado.nextLine());
        boolean sucessoDeposito = conta1.depositar(valorDeposito);

        if (sucessoDeposito) {
            System.out.printf("Saldo Atual: R$%.2f", conta1.getSaldo());
            System.out.println("");
        } else {
            System.out.println("Não é possivel fazer o deposito a conta não está aberta");
        }

        return;
    }

    private static void abrirConta() {
        Scanner teclado = new Scanner(System.in);;
        int nTipoConta;
        String nome;
        String tipo;
        String confirmacao;
        System.out.println("");
        System.out.println("Abrir conta");
        System.out.println("Qual o tipo da conta");
        System.out.println("(1) CC - Conta Corrente ");
        System.out.println("(2) CP - Conta Poupança ");
        System.out.print("Digite o numero correspondente a opção desejada: ");
        nTipoConta = Integer.parseInt(teclado.nextLine());
        System.out.println("");
        if (nTipoConta == 1) {
            System.out.println("");
            System.out.print("Qual o seu nome? ");
            nome = teclado.nextLine();
            tipo = "CC";
            status = true;
            saldo = 50;
            conta1 = new ContaBanco(tipo, status, saldo, nome);

            System.out.printf("%s, sua Conta Corrente foi criada com sucesso\n", nome);
            System.out.printf("Sua conta é %s \n", conta1.numConta);
            System.out.printf("Saldo: R$%.2f\n", conta1.getSaldo());
            System.out.println("Aperte enter para continuar");
            confirmacao = teclado.nextLine();

        } else if (nTipoConta == 2) {
            System.out.println("");
            System.out.print("Qual o seu nome? ");
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

        return;
    }
}

