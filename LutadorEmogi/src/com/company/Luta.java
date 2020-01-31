package com.company;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(int rounds) {

        this.rounds = rounds;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        setDesafiado(l1);
        setDesafiante(l2);
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            aprovada = true;
        }else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
            System.out.println("As lutas não podem acontecer, as categorias são diferentes");
        }
    }
    public void lutar(){

        if (aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            int pontosl1 = 0;
            int pontosl2 = 0;
            for (int i = 0 ;i < getRounds();i++) {
                System.out.println("-----------------------------------------");
                System.out.println("Round " + (i+1));
                System.out.println("FIGHTING");
                int nl1 = (int) (Math.random() * 2  );
                int nl2 = (int) (Math.random() * 2 );

                if (nl1 > nl2) {
                    pontosl1 ++;
                    System.out.printf("%s, o desafiado ganhou o %dº round\n", desafiado.getNome(), (i+1));
                } else if (nl2 > nl1) {
                    pontosl2 ++;
                    System.out.printf("%s, o desafiante ganhou o %dº round\n", desafiante.getNome(),(i+1));
                } else {
                    System.out.printf("Empate, ninguem venceu no %dº round\n",(i+1));
                }
            }
            System.out.println("=========== RESULTADO ===========");
            if (pontosl1 > pontosl2){
                System.out.printf("O %s, o desafiado ganhou a luta!!!\n",desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else if (pontosl2 < pontosl1){
                System.out.printf("O %s,o desafiante ganhou a luta!!!\n",desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
            } else {
                System.out.println("Ninguém venceu essa luta!!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();





            }
        }
        else {
            System.out.println("A luta não pode acontecer");
        }
    }
}
