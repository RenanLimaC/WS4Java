package loops;

import java.util.Scanner;

//Faça um programa que recebe a altura de um triangulo em um número inteiro e imprima-o utilizando asteriscos. Veja o Exemplo:

public class Exercicio5 {
    public static void main(String[] args) {
        int altura;
        String asteristico = "*";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura que deseja o triangulo.");
        altura = scanner.nextInt();

        for (int contador = 1; contador <= altura; contador++) {

            for (int i = 1; i <= contador; i++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
