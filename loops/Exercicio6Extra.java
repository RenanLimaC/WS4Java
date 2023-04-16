package loops;

import java.util.ArrayList;
import java.util.List;
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
public class Exercicio6Extra {

    static Scanner scanner = new Scanner(System.in);
    static Integer estado = 0;

    public static void main(String[] args) {

        while (estado != 3) {
            switch (estado) {
                case 0:
                    menu();
                    break;
                case 1:
                    mediaAritimetica();
                    break;
                case 2:
                    mediaPonderada();
                    break;
                default:
                    System.out.println("Opcao Invaldia");
                    estado = 0;
                    break;
            }
        }
    }

    private static void mediaPonderada() {
        List<Integer> listaNota = obterNota();

        Integer soma = 0;
        Integer contador = 1;
        Integer somaPeso = 0;
        for (Integer nota : listaNota) {
            soma = soma + nota * contador;
            somaPeso+=contador;
            contador++;
        }

        System.out.println("Media: " + (soma / somaPeso));

        estado = 0;

    }

    private static void mediaAritimetica() {
        List<Integer> listaNota = obterNota();

        Integer soma = 0;
        for (Integer nota : listaNota) {
            soma+=nota;
        }

        System.out.println("Media: " + (soma / listaNota.size()));

        estado = 0;
    }

    private static List<Integer> obterNota() {

        List<Integer> listaNota = new ArrayList<>();

        boolean pedirNota = true;

        Integer contador = 1;
        while (pedirNota) {
            System.out.println("Digite a nota " + contador);
            Integer nota = scanner.nextInt();
            listaNota.add(nota);

            System.out.println("Para adicionar mais uma nota digite 1 se nao digite 2");
            Integer estadoDaNota = scanner.nextInt();
            if (estadoDaNota == 2) {
                pedirNota = false;
            }
            contador++;
        }

        return listaNota;
    }

    private static void menu() {

        System.out.println(
                "Menu\n" + 
                        "1 - Media Aritmetica\n" +
                        "2 - Media Ponderada\n" +
                        "3 - Sair\n" +
                        "\nDigite uma opcao:"
        );
        estado = scanner.nextInt();
        scanner.nextLine();
    }

}
