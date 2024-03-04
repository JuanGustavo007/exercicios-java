package exerc12;

import exer1.Pessoa;
import exer3.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca (int numero, Pessoa pessoa, float saldo){
        super(numero, pessoa, saldo);
    }

    public void tarifaPoupanca(){
        if (this.saldo > 3000){
            this.saldo = this.saldo - (this.saldo * 0.002);
        }else{
            System.out.println("Tudo ok");
        }
    }
}
