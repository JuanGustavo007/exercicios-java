package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Setss {
    public static void main(String[] args) {
        Set sett = new HashSet();

        sett.add("Ruan");

        System.out.println(sett);

        int [] valores = {1,2,3,45,6};
        valores[2] =2;
        System.out.println(valores[2]);


        Map <Integer, String> valoresMap = new HashMap<>();


        valoresMap.put(10, "Juan");
        valoresMap.put(11, "Lucas");
        valoresMap.put(12, "Pedro");


        valoresMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
        });

    }
}
