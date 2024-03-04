package exerc7;

public class Programa {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Juan", 2000,"TI");

        funcionario.aumentoSalario(1000);
        System.out.println(funcionario.getSalario());
    }
}
