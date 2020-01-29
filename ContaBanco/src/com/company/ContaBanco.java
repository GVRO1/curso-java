package com.company;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;

    public ContaBanco(String tipoConta, boolean statusConta, Float saldoConta, String donoConta) {
        int numeroFinal = (int) (0 + Math.random() * 999 - 0);
        this.numConta = "0681-80" + numeroFinal;
        this.tipo = tipoConta;
        this.dono = donoConta;
        this.saldo = saldoConta;
        this.status = statusConta;
    }

    public Float getSaldo() {
        return saldo;
    }
    public String getDono() { return dono; }
    public boolean depositar(float deposito) {
        if (this.status) {
            saldo += deposito;
            return true;
        } else {
            return false;
        }
    }

    public String sacar(float saque) {
        if (this.status) {
            if (this.saldo >= saque) {
                saldo -= saque;
                String msg = "true";
                return msg;
            }
            else{
                String msg = "Não é possivel fazer o deposito, sua conta não tem o valor necessário";
                return msg;
            }
        } else {
            String msg = "Não é possivel fazer o deposito, a conta não está aberta";
            return msg;
        }
    }

    public String getTipo(){return tipo;}

    public String pagarMensal(){
        String msg = "";
        if (this.status) {
            if (tipo.equals("CC")) {
                saldo -= 12;
                msg = "true";

            } else if (tipo.equals("CP")) {
                saldo -= 20;
                msg = "true";
            }
        }
        else{
            msg = "Não é possivel fazer o deposito, a conta não está aberta";
        }
        return msg;
    }

    public boolean fecharConta(){
        if (this.status){
            status = false;
             return true;
        }
        else {
            return false;
        }
    }


}
