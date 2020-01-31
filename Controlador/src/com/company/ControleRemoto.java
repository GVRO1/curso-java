package com.company;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
// Metodos Abstratos
    @Override
    public void ligar() {
    this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.print("Está ligado:");
        System.out.println(getLigado());
        System.out.print("Está tocando?");
        System.out.println(getVolume());
        int i;
        for (i = 0;i < getVolume();i ++){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.printf("Fechando menu");
    }

    @Override
    public void maiVolume() {
    if (this.ligado){
        this.setVolume(this.getVolume() + 1);
    }
    }

    @Override
    public void menosVolume() {
        if (this.ligado){
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.ligado && this.getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.ligado && this.getVolume()>0){
            this.setVolume(50);
        }
    }


    @Override
    public void play() {
        if (this.getLigado() && this.getTocando()){
            this.setLigado(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setLigado(false);
        }

    }

    //Metodos abstratos
    
    
}
