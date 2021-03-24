package br.espm.poo.aula05;

public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new RuntimeException("Valor informado invalido (valor > 0)");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo - valor < 0) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

}
