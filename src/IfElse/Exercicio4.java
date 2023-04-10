package IfElse;

import java.util.Scanner;

// Faça um programa que leia três números,
// verifique (usando if e else) e mostre o maior e o menor deles;
public class Exercicio4 {

    public static void main(String[] args) {
        int Maior;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 numeros.");
        int x = scanner.nextInt();
        int z = scanner.nextInt();
        int y = scanner.nextInt();


        if (x > y && x >z) {
            System.out.println("O maior numero é " + x);
        } else if (z > x && z > y){
            System.out.println("O maior numero é " + z);
        } else {

        }
        System.out.println("O maior numero é " + y);
       /* if (x > z) {


            if (x > y) {
                System.out.println("O maior numero é " + x);
            } else if (z > x) ;
        } else if (z > y) {
            System.out.println("O maior numero é " + z);
        } else {
            System.out.println("O maior numero é " + y);
       }
*/
    }
}
