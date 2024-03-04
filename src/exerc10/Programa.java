package exerc10;

public class Programa {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1000, 20);

        System.out.println(produto.valorEstoque());


        produto.retirar(3);

        System.out.println(produto.valorEstoque());
    }
}
