package loops;

//  Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
//a) A quantidade de pessoas em cada faixa etária;
//b) A percentagem de pessoas na primeira e na última faixa etária, com relação ao total de pessoas:
//Até 15 anos
//De 16 a 30 anos
//De 31 a 45 anos
//De 46 a 60 anos
//Acima de 61 anos

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Integer qIdades = 15, idades, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade de 15 pessoas.");

        while (qIdades >= 1) {
            idades = scanner.nextInt();
            lista.add(idades);
            qIdades--;

        }
        for (Integer idade : lista) {
            if (idade <= 15) {
                contador1++;
            } else if (idade <= 30 && idade > 15) {
                contador2++;
            } else if (idade <= 45 && idade > 30) {
                contador3++;
            } else if (idade <= 60 && idade > 45) {
                contador4++;
            } else {
                contador5++;
            }

        }
        System.out.println("tem " + contador1 + " pessoas com menos de 15 anos.");
        System.out.println("tem " + contador2 + " pessoas entre 16 e 30 anos.");
        System.out.println("tem " + contador3 + " pessoas entre 31 e 45 anos.");
        System.out.println("tem " + contador4 + " pessoas entre 46 e 60 anos.");
        System.out.println("tem " + contador5 + " pessoas mais de 60 anos.");
        System.out.println((contador1 * 100) / 15 + "% das pessoas tem ate 15 anos.");
        System.out.println((contador5 * 100) / 15 + "% das pessoas tem acima de 60 anos.");
    }
}
