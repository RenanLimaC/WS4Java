package funcoes;

import java.util.Scanner;


//Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade expressa em dias.
public class Exercicio2 {


    public static int anos(int qAnos) {
        int retornoAnos = qAnos * 365;
        return  retornoAnos;
    }
    public static int meses(int qMeses){
        int retornoMeses = qMeses * 30;
        return retornoMeses;
    }


    public static void main(String[] args) {
        int qAnos, qMeses , qDias;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade em anos");
        qAnos = scanner.nextInt();
        System.out.println("Agora digite os meses.");
        qMeses = scanner.nextInt();
        System.out.println("Agora os dias");
        qDias = scanner.nextInt();

        qAnos = anos(qAnos);
        qMeses = meses(qMeses);


        System.out.println("Você tem a idade de " + (qAnos+qMeses+qDias) + " dias.");
    }

}
