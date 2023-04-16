package loops;

import java.util.Scanner;

//Faça uma função que receba um valor inteiro e positivo e calcula o seu fatorial.
public class Exercicio2 {

    public static void main(String[] args) {
        int numRes;
        long fatorial;
        final int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero e mostraremos seu fatorial.");
        num = scanner.nextInt();
        numRes = num;
        fatorial = numRes;

        while (numRes > 1) {
            fatorial = fatorial * (numRes - 1);
            numRes--;
            //    System.out.println("!" + num + " = " + fatorial);


        }

        System.out.println("!" + num + " = " + fatorial);

    }
}


