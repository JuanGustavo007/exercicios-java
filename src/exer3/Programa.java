package exer3;

import exer1.Pessoa;

public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Juan", "20", "Masculino");
        ContaBancaria contaBancaria = new ContaBancaria(2222, pessoa,  3000.0f);

        contaBancaria.deposito(3000);
        contaBancaria.sacar(6000);
        System.out.println(contaBancaria.getSaldo());
    }
}
