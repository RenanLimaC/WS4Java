package loops;
// Faça um programa que receba um número e usando laços de repetição calcule e mostre a tabuada desse número.


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num, tab = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero e iremos mostrar a sua tabuada.");
        num = scanner.nextInt();

        while (tab < 10) {
            tab++;
            System.out.println(num + " X " + tab + " = "+ (num * tab));
        }

    }
}
