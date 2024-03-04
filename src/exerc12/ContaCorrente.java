package exerc12;

import exer1.Pessoa;
import exer3.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, Pessoa pessoa, float saldo) {
        super(numero, pessoa, saldo);
    }

    public void tarifasSaldoNegativo(){
       if (this.saldo < 0){
           this.saldo = this.saldo - (-this.saldo * 0.04);
       }else{
           System.out.println("Tudo correto!!!");
       }
    }
}