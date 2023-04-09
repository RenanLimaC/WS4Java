package IfElse;

import java.util.Scanner;

//Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles


public class Exercicio1 {
    int numero;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite um numero");
        int numero = scanner.nextInt();
        System.out.println("digite outro numero");
        int outroNumero = scanner.nextInt();

        if (numero > outroNumero) {
            System.out.println(numero);
        } else {
            System.out.println(outroNumero);
        }


    }
}
