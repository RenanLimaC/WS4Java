package IfElse;

import java.util.Scanner;

// As organizações CSM resolveram dar um aumento de salário aos seus colaboradores,
// e lhe contrataram para desenvolver o programaque calculará os reajustes.
//a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
//b. Salários até R$ 280,00 (incluindo): aumento de 20%;
//c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
//d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
//e. Salários de R$ 1500,00 em diante: aumento de 5%
//Após o aumento ser realizado; informe na tela;
//a. O salário antes do reajuste;
//b. O percentual de aumento aplicado;
//c. O valor do aumento;
//d. O novo salário, após o aumento;
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double SalarioBase, PercentAumento, ValorAumento, SalarioReajustado;

        System.out.println("Digite seu salario atual");
        SalarioBase = scanner.nextDouble();

        if (SalarioBase <= 280.00) {
            PercentAumento = 0.20;
            //ValorAumento = SalarioBase * PercentAumento;
            //SalarioReajustado = SalarioBase + ValorAumento;
        } else if (SalarioBase <= 700.00 && SalarioBase >= 280.01) {
            PercentAumento = 0.15;
            //ValorAumento = SalarioBase * PercentAumento;
            //SalarioReajustado = SalarioBase + ValorAumento;
        } else if (SalarioBase <= 1500.00 && SalarioBase >= 700.01) {
            PercentAumento = 0.10;
            //ValorAumento = SalarioBase * PercentAumento;
            //SalarioReajustado = SalarioBase + ValorAumento;
        } else {
            PercentAumento = 0.05;
            //ValorAumento = SalarioBase * PercentAumento;
            //SalarioReajustado = SalarioBase + ValorAumento;
        }

        ValorAumento = SalarioBase * PercentAumento;
        SalarioReajustado = SalarioBase + ValorAumento;

        System.out.println("Seu salario antes do reajuste é: R$" + SalarioBase);
        System.out.println("Seu percentual de aumento é de: " + PercentAumento * 100 + "%");
        System.out.println("O valor do seu aumento é de: R$" + ValorAumento);
        System.out.println("Seu salario com reajuste é: R$" + SalarioReajustado);

    }
}
