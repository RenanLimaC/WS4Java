package OrientadoObjeto;


import java.util.Scanner;

public class Conta {
    private String titular;
    private double saldo;

    public Conta (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }
    public Conta (){

    }

    void imprimirSaldo(){
        System.out.println("Titular da conta: " + titular + "\n Saldo R$ " + saldo);


    }
    void depositar (double deposito){
        saldo = saldo + deposito;

    }
    void retirada(double saque) {


        if (saldo < saque) {
            System.out.println("SALDO INSUFICIENTE.");
        } else {
            saldo = saldo - saque;
        }

    }


    void transferencia(Conta contaDestino, double valor) {
        this.retirada(valor);
        contaDestino.depositar(valor);


    }


}
