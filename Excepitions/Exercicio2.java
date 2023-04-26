package Excepitions;

import java.util.Scanner;

// 2 - Crie um programa que leia uma senha do usuário e exiba uma mensagem de sucesso caso a senha seja "1234".
// Caso contrário, lance uma exceção personalizada.
public class Exercicio2 {
    public static void main(String[] args) {
        long senha;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha de 4 digitos.");
        senha = scanner.nextLong();
        if(senha != 1234){
            try {
                throw new ExceptionPersonalizada ("SENHA INCORRETA!");
            }catch (ExceptionPersonalizada e){
                System.out.println(e.getMessage());;
            }
        }else {
            System.out.println("SUCESS0!");
        }

    }
}
