package com.example.demo;

public class ContaBancaria {
    private final String agencia;
    private final int saldo;

    public ContaBancaria(String agencia, int saldo) {
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getSaldo() {
        return saldo;
    }
}
