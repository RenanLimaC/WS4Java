package DataStructures;

import java.util.HashMap;
import java.util.Map;

// 7 - Juntar dois hash maps e somar os valores das chaves em comum:
//Entrada:
//map1 = {“um”: 3, “dois”: 1, “tres”:10};
//map2 = {“um”: 1, “dois”: 5, “cinco”: 1, “quatro”:10};
//Saida:
//A junção com soma dos valores em comum é: {“um”: 4 “dois”: 6, “tres”:10, “cinco”: 1, “quatro”:10};
public class Exercicio7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> mapSoma = new HashMap<>();
        map1.put("um", 3);
        map1.put("dois", 1);
        map1.put("tres", 10);
        map2.put("um", 1);
        map2.put("dois", 5);
        map2.put("cinco", 1);
        map2.put("quatro", 10);


        somaDosMaps(map1, map2, mapSoma);
        System.out.println("A junção com soma dos valores em comum é: " + mapSoma);

    }

    private static void somaDosMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2, HashMap<String, Integer> mapSoma) {
        for (Map.Entry<String, Integer> valor : map1.entrySet()) {
            String key = valor.getKey();
            int value = valor.getValue();
            for (Map.Entry<String, Integer> valor2 : map2.entrySet()) {
                String key2 = valor2.getKey();
                int value2 = valor2.getValue();
                if (key.equalsIgnoreCase(key2)) {
                    Integer valueSoma = value + value2;
                    mapSoma.put(key, valueSoma);
                } else if (!mapSoma.containsKey(key)) {
                    mapSoma.put(key, value);
                } else if (!mapSoma.containsKey(key2)) {
                    mapSoma.put(key2, value2);
                }
            }
        }
    }
}
