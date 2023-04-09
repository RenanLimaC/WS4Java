package IfElse;

import java.util.Scanner;

// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
public class Exercicio2 {
    int numero;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero (positivo ou negativo)");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Esse é um numero positvo!");
        } else {
            System.out.println("Esse é um numero negativo!");
        }


    }
}
