package DataStructures;
//Encontrar o maior elemento de um vetor e lista:
//Entrada:
//vetor = {5, 2, 8, 1, 9};
//Saida:
//O maior elemento do vetor é: 8

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 9};
        List<Integer> lista = Arrays.asList(5, 2, 8, 1, 9);

        mostrarMaiorNumeroVetor(vetor);
        mostrarMaiorNumeroLista(lista);

    }

    private static void mostrarMaiorNumeroLista(List<Integer> lista) {
        int valor, maiorValor = 0;
        for (int i = 0; i < lista.size(); i++){
            valor = lista.get(i);
            if (valor >= maiorValor){
                maiorValor = valor;
            }
        }
        System.out.println("O maior elemento do lista é: " + maiorValor);

    }

    private static void mostrarMaiorNumeroVetor(int[] vetor) {
        int valor, maiorValor = 0;

        for (int i = 0; i < vetor.length; i++) {
            valor = vetor[i];
            if (valor >= maiorValor) {
                maiorValor = valor;
            }
        }
        System.out.println("O maior elemento do vetor é: " + maiorValor);

    }
}
