package loops;

import java.util.Scanner;

// Faça um programa que apresente o menu de opções a seguir:
//Menu de opções:
//1. Média aritmética
//2. Média ponderada
//3. Sair
//Digite a opção desejada:
//Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
//Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
//Na opção 3: sair do programa.
//Verifique a possibilidade de opção inválida, mostrando uma mensagem.
public class Exercicio6 {
    public static void main(String[] args) {
        Integer opcao, nota1, nota2, nota3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero para fazer a media:");
        System.out.println("1 - para media aritimética.");
        System.out.println("2 - para media ponderada.");
        System.out.println("3 - para sair.");
        opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Digite a primeira nota.");
            nota1 = scanner.nextInt();
            System.out.println("Digite a segunda nota.");
            nota2 = scanner.nextInt();
            Integer media = mediaAritimetica(nota1,nota2);
            System.out.println(media);
        } else if (opcao == 2) {
            System.out.println("Digite a primeira nota.");
            nota1 = scanner.nextInt();
            System.out.println("Digite a segunda nota.");
            nota2 = scanner.nextInt();
            System.out.println("Digite a terceira nota");
            nota3 = scanner.nextInt();
            Integer media = mediaPonderada(nota1, nota2, nota3);
            System.out.println(media);
        } else if (opcao == 3){
            System.out.println("Saindo do programa.");
        } else {
            System.out.println("Opção invalida.");
        }


    }

    private static Integer mediaAritimetica(Integer nota1, Integer nota2) {
        return (nota1 + nota2) / 2;
    }

    private static Integer mediaPonderada(Integer nota1, Integer nota2, Integer nota3) {
        return ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / (5 + 3 + 2);
    }
}
