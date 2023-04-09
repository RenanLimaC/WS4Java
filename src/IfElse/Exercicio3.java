package IfElse;

//Faça um programa para a leitura de duas notas parciais de um aluno.
//A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
//A mensagem “Aprovado com Distinção”, se a média for igual a dez;
//A mensagem “Reprovado” se a média for menor de do que sete;

import java.util.Scanner;

public class Exercicio3 {
    int nota;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota (de 0 a 10)");
        int nota = scanner.nextInt();

        if (nota == 10) {
            System.out.println("APROVADO COM DISTINÇÃO!");
        } else if (nota < 10 && nota > 7) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
