package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Soma todos os elementos de um vetor e lista:
//Entrada:
//vetor = {1, 2, 3, 4, 5};
//Saida:
//A soma dos elementos do vetor é: 15
public class Exercicio1 {


    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        somarValoresVetor(vetor);
        somarValoresLista(lista);


    }

    private static void somarValoresLista(List<Integer> lista) {
        Integer soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma = soma + lista.get(i);
        }

        System.out.println("A soma dos elementos da lista é: " + soma);
    }


    private static void somarValoresVetor(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);

    }

}
