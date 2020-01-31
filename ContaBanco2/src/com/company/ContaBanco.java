package com.company;

public class ContaBanco {

    public static int qtdContas = 0;

    public String numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;

    public ContaBanco() {
    }

    public static ContaBanco abrirConta(String nome, String nConta, String tipoC) {

        ContaBanco nova = new ContaBanco();

        nova.dono = nome;
        nova.numConta = nConta;
        nova.tipo = tipoC;
        nova.status = true;
        if (tipoC.equals("CC")) {
            nova.saldo = 50f;
        } else if (tipoC.equals("CP")) {
            nova.saldo = 150f;
        }

        qtdContas++;

        return nova;
    }

    public String getNome() {
        return this.dono;
    }

    public String fecharConta() {
        String msg;
        if (this.saldo == 0) {
            this.status = false;
            msg = "A conta do " + this.dono + " " +
                    "foi fechado com sucesso";
        } else if (this.saldo <= 0) {
            msg = "A conta do " + this.dono + " não pode ser fechada, quite seus débitos para poder fechar-la";
        }
        else{
            msg = "A conta do " + this.dono + " não pode ser fechada, retire seu dinheiro para poder fecha-la";
        }
        return msg;
    }

    public String depositar(Float valor) {
        String msg;
        if (this.status) {
            this.saldo += valor;
            msg = "Deposito efetuado com sucesso\nSaldo Atual:" + this.saldo;
        } else{
            msg = "Deposito invalido, a conta não está aberta";
        }
        return msg;
    }

    public String sacar(Float valor) {
        String msg;
        if (this.status){
            if (this.saldo > valor){
                this.saldo -= valor;
                msg = "Saque efetuado com sucesso\nSaldo Atual:" + this.saldo;
            }else {
                msg = "Saque invalido, não tem " + valor + " em sua conta\nSaldo Atual:" + this.saldo;
            }
        }else {
            msg = "Saque invalido, a conta não está aberta";
        }
        return msg;
    }

    public String pagarMensal() {
        String msg;
        if (this.status) {

            if (tipo.equals("CC")) {
                this.saldo -= 12;
            } else if (tipo.equals("CP")) {
                this.saldo -= 20;
            }
            msg = "Pagamento Efetuado com sucesso\nSaldo Atual:" + this.saldo;
        } else {
            msg = "Pagamento invalido, a conta não está aberta";
        }
        return msg;
    }

    public void dadosContas(){
        System.out.println("-----------------------");
        System.out.printf("Dono da Conta: %s\n", this.dono);
        System.out.printf("Numero da Conta: %s\n", this.numConta);
        System.out.printf("Tiṕo: %s\n", this.tipo);
        System.out.printf("Saldo Conta: %.2f\n", this.saldo);
        if (this.status){
            System.out.println("Status:Aberta");
        } else{
            System.out.println("Status:Fechada");

        }


    }

}
