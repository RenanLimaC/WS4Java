package OrientadoObjeto;
//Crie uma classe chamada "Carro" que tenha as propriedades "modelo", "ano" e "preço".
// Em seguida, crie um objeto da classe Carro e exiba suas propriedades na tela.


import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Ferrari");
        Carro carro3 = new Carro("Fusca", 1970, 30000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dos modelos: Ferrari, Celta ou Cruze. ");
        String modelo = scanner.next();
        Carro carro4 = new Carro(modelo);
        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
        carro4.imprimir();


    }


}
