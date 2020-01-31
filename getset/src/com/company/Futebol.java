package com.company;

public class Futebol {
    private String nomeTime; // var de instancia
    private static String nomeSelecao; // var de classe

    // Isso é um construtor
    public Futebol() {
        nomeSelecao = "Brasileira";
    }


    public void setTime(String meuTime) {
        nomeTime = meuTime;
    }
    public String getTime(){
        return nomeTime;
    }
    public void mostraTime(){
        System.out.printf("Seu time do coração é %s\n", getTime());
    }

    public void setSelecao(String selecao){
        nomeSelecao = selecao;
    }
    public String getSelecao(){
        return nomeSelecao;
    }
    public void mostraSelecao() {
        System.out.printf("Sua seleção é %s\n", getSelecao());
    }
}