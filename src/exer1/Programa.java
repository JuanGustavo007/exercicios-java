package exer1;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Juan", "20", "Masculino");

        System.out.println(pessoa.getAge());
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getGender());
    }
}
