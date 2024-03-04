package exerc6;

public class Programa {
    public static void main(String[] args) {
        Retangulo  retangulo = new Retangulo(10, 0);

        try{
            System.out.println(retangulo.area());
        }catch (Exception e) {
            System.out.println("Deu um erro aqui irmão" + e);
        }
    }
}
