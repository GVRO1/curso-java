package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Equação de Segundo Grau");
        System.out.println("Ax² + Bx + C");
        System.out.print("A:");
        int a = teclado.nextInt();
        System.out.print("B:");
        int b = teclado.nextInt();
        System.out.print("C:");
        int c = teclado.nextInt();
        System.out.printf("%dx² + %dx + %d \n", a, b ,c);


        float b2 = (float )Math.pow(b,2);
        float delta = b2 -4*a*c;

        System.out.println("\nDelta = b² -4*A*C");
        System.out.printf("Delta = %f -4*%d*%d\n\n",b2 ,a, c);
        System.out.println("Delta = " + delta);

        if (delta < 0){
            System.out.println("Não Existem Raizes Reais");
            System.out.print("Tentar novamente?(s/n)");
            teclado.nextLine();
            String res = teclado.nextLine();
            if (res.equals("s")) {
                main();
            } else {
                System.out.println("Até a próxima");
            }
        } else {
            float raiz = (float )Math.sqrt(delta);
            float x1 = (-b + raiz)/2;
            float x2 = (-b -raiz)/2;
            System.out.println("X = -b +/- Delta^(1/2)");
            System.out.printf("X = -%d +/- %f^(1/2) \n", b ,delta);
            System.out.println("X¹ = " + x1);
            System.out.println("X² = " + x2);
            System.out.print("Tentar novamente?(s/n)");
            teclado.nextLine();
            String res = teclado.nextLine();
            if (res.equals("s")) {
                main();
            } else {
                System.out.println("Até a próxima");
            }
        }




    }
}
