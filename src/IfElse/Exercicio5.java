package IfElse;

import java.util.Scanner;

//Faça um programa que peça os 3 lados de um triângulo.
// O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro.
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;
public class Exercicio5 {
    public static void main(String[] args) {
        int LadoA, LadoB, LadoC, Triangulo, x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de cada lado do triangulo");
        LadoA = scanner.nextInt();
        LadoB = scanner.nextInt();
        LadoC = scanner.nextInt();
        Triangulo = LadoA + LadoB + LadoC;
        x = LadoA + LadoB;

        if (x > LadoC) {
            System.out.println("Os valores informados nao condizem a um triangulo!");
        } else if (LadoA != LadoB && LadoB != LadoC && LadoA != LadoC) {
            System.out.println("Esse é um triangulo Escaleno!");
        } else if (Triangulo / Triangulo == 1) {
            System.out.println("Esse é um triangulo Equilátero!");
        } else if (LadoA == LadoB || LadoA == LadoC || LadoB == LadoC) {
            System.out.println("Esse é um triangulo Isósceles!");
        } else {
            return;
        }


    }
}

