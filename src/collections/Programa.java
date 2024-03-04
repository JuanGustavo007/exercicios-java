package collections;

import exer1.Pessoa;

import java.util.ArrayList;
import java.util.Collections;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Pessoa> arrayList= new ArrayList();

        Pessoa pessoa = new Pessoa("Juan", "26", "Male");

        arrayList.add(pessoa);

        for (Pessoa pessoa1 : arrayList){
            System.out.println(pessoa1);
        }

    }
}
