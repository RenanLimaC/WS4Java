package DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Remover elementos duplicados de uma lista:
//Entrada:
//lista = {5, 2, 2, 8, 1, 9, 9};
//Saida:
//A lista sem elementos duplicados possui: 5 2 8 1 9
public class Exercicio4 {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(5, 2, 2, 8, 1, 9, 9);
        
        transformarListEmSet(lista);


    }

    private static void transformarListEmSet(List<Integer> lista) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(lista);
        System.out.println("A lista sem elementos duplicados possui: \n" + set);

    }

}
