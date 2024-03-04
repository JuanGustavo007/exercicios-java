package exer14;

public class Programa {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("123", "Juan", 10);

        pedido.add(3);

        System.out.println(pedido.getItens());
    }
}
