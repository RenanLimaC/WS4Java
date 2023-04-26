package DataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 5 - Contar o número de ocorrências de cada elemento em uma lista utilizando hash map:
//Entrada:
//lista = {5, 2, 2, 8, 1, 9, 9, 9};
//Saida:
//Número de ocorrências de cada elemento: { 5: 1, 2: 2, 8: 1, 1: 1, 9: 3 }
public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 2, 2, 8, 1, 9, 9, 9);

        reincidencia(lista);


    }

    private static void reincidencia(List<Integer> lista) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < lista.size(); i++){
            int numero = lista.get(i);
        if(map.containsKey(numero)){
            int frequencia = map.get(numero);
            map.put(numero, frequencia + 1);
        }else{
            map.put(numero, 1);
        }
        }
        System.out.println(map);

    }
}
//PRECISEI, PESQUISAR PARA FAZER A LOGICA DESSE.