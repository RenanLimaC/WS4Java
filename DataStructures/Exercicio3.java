package DataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Ordenar um vetor e lista em ordem crescente:
//Entrada:
//vetor = {5, 2, 8, 1, 9};
//Saida:
//O vetor ordenado em ordem crescente é: 1 2 5 8 9
public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 9};
        List<Integer> lista = Arrays.asList(5, 2, 8, 1, 9);
        ordemCrescenteDoVetor(vetor);
        ordemCrescenteDaLista(lista);

    }

    private static void ordemCrescenteDaLista(List<Integer> lista) {
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
        }
        System.out.println("A lista ordenada em ordem crescente é: \n" + lista);
    }

    private static void ordemCrescenteDoVetor(int[] vetor) {
        Arrays.sort(vetor);
        System.out.println("O vetor ordenado em ordem crescente é: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }


}