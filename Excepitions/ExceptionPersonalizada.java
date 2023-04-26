package Excepitions;

public class ExceptionPersonalizada extends Exception {

    public ExceptionPersonalizada(String mensagem) {
        super(mensagem);
    }

    public ExceptionPersonalizada() {
        super("ERRO");


    }
}






