package DataStructures;

import java.util.HashMap;
import java.util.Map;

// 6 - Encontrar a chave com o maior valor em um hash map:
//Entrada:
//map = {“um”: 3, “dois”: 1, “tres”:10};
//Saida:
//A chave com o maior valor é: tres
public class Exercicio6 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("um", 3);
        map.put("dois", 1);
        map.put("tres", 10);
        chaveComMaiorValor(map);
    }

    private static void chaveComMaiorValor(HashMap<String, Integer> map) {
        int maiorValor = 0;
        String chaveMaiorValor = "";
        for (Map.Entry<String, Integer> valor : map.entrySet()) {
            int value = valor.getValue();
            String chave = valor.getKey();
            if (value > maiorValor) {
               // maiorValor = value;
                chaveMaiorValor = chave;
            }
        }
        System.out.println("A chave com o maior valor é: " + chaveMaiorValor);



    }


}

//