package exer14;

public class Pedido {
    private String numero;

    private String cliente;
    private int itens;

    public Pedido (String numero, String cliente, int itens) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = itens;
    }

    public void add(int item){
        this.itens = this.itens + item;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }
}
