package funcoes;

import java.util.Scanner;

/* Escreva um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra.
 Se a letra for A o procedimento calcula a média aritmética das notas do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2)
 e se for H, a sua média harmônica. A média calculada também deve retornar por parâmetro.

* media ponderada = (nota1 * 5 + nota2 * 3 + nota3 * 2)/ 3+5+2

* media harmonica = 3/(1/nota1 + 1/nota2 + 1/nota3)
*/
public class Exercicio3 {

    public static double media(double nota1, double nota2, double nota3, String tipoMedia) {
        double resMedia = 0.0;

        if (tipoMedia.equalsIgnoreCase("A")) {

            resMedia = (nota1 + nota2 + nota3) / 3;

        } else if (tipoMedia.equalsIgnoreCase("P")) {

            resMedia = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / (5 + 3 + 2);

        } else if (tipoMedia.equalsIgnoreCase("H")) {

            resMedia = 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);

        }

        return resMedia;

    }

    public static void main(String[] args) {
        double nota1, nota2, nota3, resMedia;
        String tipoMedia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas 3 notas:");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        System.out.println("Digite o tipo de média. A para aritimetica, P para ponderada e H para harmonica");
        tipoMedia = scanner.next();

        resMedia = media(nota1, nota2, nota3, tipoMedia);

        System.out.println(resMedia);
    }

}
