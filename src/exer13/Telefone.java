package exer13;

import java.util.ArrayList;

public class Telefone {
    private String numero;

    private String operadora;

    ArrayList <String> mensagem = new ArrayList<>();

    public Telefone (String numero, String operadora){
        this.numero =numero;
        this.operadora =operadora;
    }

    public void fazerLigacao (){
        if (this.numero.length() > 10 & this.numero.length() <= 11){
            System.out.println("Ligação realizada");
        }else{
            System.out.println("Algo está errado");
        }
    }

    public void enviarMensagem(String texto){
        mensagem.add(texto);
    }

    public ArrayList<String> getMensagem() {
        return mensagem;
    }

    public void setMensagem(ArrayList<String> mensagem) {
        this.mensagem = mensagem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
}
