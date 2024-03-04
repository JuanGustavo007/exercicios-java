package exer13;

public class Programa {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("11953115699", "vivo");



        telefone.enviarMensagem("Fala baga");
        telefone.enviarMensagem("Sou eu o juan");
        telefone.getMensagem().forEach(mensagem -> {
            System.out.println(mensagem);
        });
    }
}
