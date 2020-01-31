package com.company;

public class Main {

    public static void main(String[] args) {
    Lutador[] l = new Lutador[3];
            l[0] = new Lutador("Gabriel","Brasileiro","Médio",1.76f,83.8f,18,98,1,1);
            l[1] = new Lutador("Rogério","Alemão","Leve",2.36f,53.8f,58,8,9,18);
            l[2] = new Lutador("Kapushon","Russo","Leve",1.46f,59.8f,28,0,0,68);
    Luta luta1 = new Luta(3);
    luta1.marcarLuta(l[1],l[2]);
    luta1.lutar();
    l[1].status();
    l[2].status();
    }
}
