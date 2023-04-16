package loops;

// Escreva um aplicativo que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero.");
        num = scanner.nextInt();

        while (num > 1) {
            if (num % 2 == 0) {
                listaPar.add(num);

            } else {
                listaImpar.add(num);


            }

            num--;
        }
        System.out.println("numeros pares " + listaPar);
        System.out.println("numeros impares " + listaImpar);

    }

}

