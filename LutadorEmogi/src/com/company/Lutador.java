package com.company;

public class Lutador {
    String nome, nacionalidade, categoria;
    float altura, peso;
    int idade,vitorias,derrotas,empates;

    public Lutador(String nome, String nacionalidade, String categoria, float altura, float peso, int idade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.categoria = categoria;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.printf("Apresentando %s, %s, de %d anos \nCategoria: Peso %s \nPesando %.2f Kg\nCom %d vitórias\n %d empates\n %d derrotas\n",
                getNome(),getNacionalidade() ,getIdade() , getCategoria(), getPeso(), getVitorias(), getEmpates(), getDerrotas());
    }
    public void status(){
        System.out.println("---------------------------------------------------------");
        System.out.printf("Nome:%s\n",getNome());
        System.out.printf("Nacionalidade:%s\n",getNacionalidade());
        System.out.printf("Categoria:%s\n",getCategoria());
        System.out.printf("Peso:%.2f\n",getPeso());
        System.out.printf("Vitórias:%d\n",getVitorias());
        System.out.printf("Empates:%d\n",getEmpates());
        System.out.printf("Derrotas:%d\n",getDerrotas());
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
}