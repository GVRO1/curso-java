package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero:");

        String n1 = teclado.nextLine();
        n1 = n1.replaceAll(",",".");

        float numero1 = Float.parseFloat(n1);

        System.out.println("Digite outro numero:");
        String n2 = teclado.nextLine();
        n2 = n2.replaceAll(",",".");
        float numero2 = Float.parseFloat(n2);

        calculadora(numero1, numero2);


    }

    static void calculadora(float n1, float n2) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a operação?");
        System.out.println("Digite + para soma");
        System.out.println("Digite - para subtração");
        System.out.println("Digite * para multiplicação");
        System.out.println("Digite / para divisão");
        System.out.println("Digite % para resto da divisão");
        System.out.println("Digite p para potenciação");

        String operacao = teclado.nextLine();

        switch (operacao) {
            case "+":
                float soma = n1 + n2;
                System.out.printf("Soma desses numeros: %.2f \n", soma);
                break;
            case "-":
                float sub = n1 - n2;
                System.out.printf("Subtração desses numeros: %.10f \n", sub);
                break;
            case "*":
                float multi = n1 * n2;
                System.out.printf("Multiplicação desses numeros: %.10f \n", multi);
                break;
            case "/":
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Não é possivel divisão por 0");
                    main();
                }
                float divi = n1 / n2;
                System.out.printf("Divisão desses numeros: %.10f \n", divi);
                break;
            case "%":
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Não é possivel divisão por 0");
                    main();
                }
                float rest = n1 % n2;
                System.out.printf("Restos desses numeros: %.10f \n", rest);
                break;
            case "p":
                double pow = Math.pow(n1, n2);
                System.out.printf("O %f elevado a %f é igual a: %f \n", n1, n2, pow);
                break;
            default:
                calculadora(n1, n2);
                break;
        }

        System.out.println("Quer fazer outra operação com os mesmos numeros? (s/n)");
        String outraOp = teclado.nextLine();

        if (outraOp.equals("s") || outraOp.equals("S") || outraOp.equals("sim") || outraOp.equals("Sim")) {
            calculadora(n1, n2);
        } else {
            System.out.println("Quer usar outro numero?(s/n)");
            String resposta = teclado.nextLine();
            if (resposta.equals("s") || resposta.equals("S") || resposta.equals("sim") || resposta.equals("Sim")) {
                main();
            }
            System.out.println("Até a próxima");


        }
    }
}