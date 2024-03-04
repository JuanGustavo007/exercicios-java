package exerc12;

import exer1.Pessoa;

public class Programa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Juan", "12", "masculino");
        ContaCorrente contaCorrente = new ContaCorrente(1234, pessoa, -2000);
        contaCorrente.tarifasSaldoNegativo();

        System.out.println(contaCorrente.getSaldo());


        ContaPoupanca contaPoupanca = new ContaPoupanca(1232, pessoa, 200);
        contaPoupanca.tarifaPoupanca();
    }
}
