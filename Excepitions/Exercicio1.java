package Excepitions;

import java.util.Scanner;

// 1 - Crie um programa que leia dois números inteiros do usuário e exiba o resultado da divisão do primeiro pelo segundo.
// Caso o segundo número seja zero, lance uma exceção personalizada.
public class Exercicio1 {
    public static void main(String[] args) {
        double numero1, numero2, resultado;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro numero.");
            numero1 = scanner.nextInt();
            System.out.println("Agora digite por quanto quer dividir.");
            numero2 = scanner.nextInt();
            if (numero2 == 0) {
                throw new ExceptionPersonalizada("NÃO É POSSIVEL DIVIDIR POR 0!");
            } else {
                resultado = numero1 / numero2;
                System.out.println("O RESULTADO DA DIVISÃO É: " + (resultado));
            }


        }catch (ExceptionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }
}