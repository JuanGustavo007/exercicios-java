package exer2;

public class Programa {

    public static void main(String[] args) {
        Carro carro = new Carro("Corolla", "Toyata" , "2024");
        System.out.println(carro.getBrand());
        System.out.println(carro.getModel());
        System.out.println(carro.getYear());
    }
}
