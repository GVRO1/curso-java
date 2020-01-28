package com.company;

public class Main {

    public static void main(String[] args) {
    int a = 2;
    int b = 4;

        System.out.printf("O quadrado de %d é %.2f\n", a , Expoente.elevar(a));
        System.out.printf("%d elevado a %d é %.2f", a, b, Expoente.elevar(a,b));

    }
}
