package funcoes;

import java.util.Scanner;

// Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo.
// A função deve retornar um valor booleano.
public class Exercicio1 {
    public static boolean numberIsPositive(int num) {
        return num >= 0;
    }

    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero.");
        num = scanner.nextInt();


        if (numberIsPositive(num)) {
            System.out.println("É um numero positivo!");
        } else {
            System.out.println("É um numero negativo!");
        }
    }
}
