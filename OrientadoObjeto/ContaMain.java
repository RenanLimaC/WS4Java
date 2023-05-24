package OrientadoObjeto;
// EXERCICIO 2

// Crie uma classe chamada "Conta" que tenha as propriedades "saldo" e "titular".
// Em seguida, crie dois objetos da classe Conta e execute as seguintes operações:
//Deposite 500 reais na primeira conta.
//Retire 200 reais da segunda conta.
//Exiba o saldo das duas contas na tela.
//Transfira um valor entre as duas contas.
public class ContaMain {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Renan ", 1500);
        Conta conta2 = new Conta("José ", 1000);

        conta1.depositar(500);
        conta2.retirada(200);
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        conta1.transferencia(conta2, 600);
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();




    }
}
