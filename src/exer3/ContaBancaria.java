package exer3;

import exer1.Pessoa;

public class ContaBancaria {
    //Crie uma classe ContaBancaria com os atributos numero, titular e saldo. Inclua métodos para depositar e sacar dinheiro da conta.
    private int numero;
    private Pessoa pessoa;
    protected double saldo;

    public ContaBancaria (int numero, Pessoa pessoa, float saldo){
        this.numero = numero;
        this.pessoa = pessoa;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    public void deposito (float valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar (float valor){
        if (valor > this.saldo){
            System.out.println("O valor que voce está tentando sacar é maior que o seu saldo");
        }else {
            this.saldo = this.saldo - valor;
        }
    }
}
