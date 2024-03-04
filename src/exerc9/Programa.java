package exerc9;

public class Programa {
    public static void main(String[] args) {
        Dog dog = new Dog("Loop", "dog");
        System.out.println(dog.emitirSom("dog"));
        System.out.println(dog.latir());


        Cat cat = new Cat("Branquinha", "Cat");

        System.out.println(cat.miau());
    }
}
