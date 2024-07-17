package entities;

import java.util.Scanner;

public class Conta {

    private String numeroDaConta;
    public String nomeDoTitular;
    private double depositoInicial;
    private double saldoTotal;

    // public Conta(){}

    Scanner sc = new Scanner(System.in);

    // public Conta (String nomeDoTitular)
    // {
    // //this.numeroDaConta = numeroDaConta;
    // this.nomeDoTitular = nomeDoTitular;
    // }

    public String GetNumeroDaConta() {
        return numeroDaConta;
    }

    public void SetNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double GetDepositoInicial() {
        return depositoInicial;
    }

    public void SetDepositoInicial(int depositoInicial) {
        this.depositoInicial = depositoInicial;
        this.saldoTotal += depositoInicial;
        System.out.println("sucesso!");
    }

    public void MostrarConta() {
        System.out.println("Dados da Conta:");
        System.out.printf("Conta %s, Titular: %s, Saldo: %.2f", numeroDaConta, nomeDoTitular, saldoTotal);
    }

    public void NovoDeposito(Double deposito) {
        this.saldoTotal += deposito;
    }

    public void Saque(Double saque) {
        this.saldoTotal -= (saque + 5);
    }
}
