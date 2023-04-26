package OrientadoObjeto;

public class Carro {
    public String modelo;
    private Integer preco;
    public Integer ano;

public Carro (String modelo){
    this.modelo = modelo;
    if (modelo.equalsIgnoreCase("Ferrari")){
       preco = 1000000;
       ano = 2010;
    } else if (modelo.equalsIgnoreCase("Celta")) {
        preco = 15000;
        ano = 2015;
    } else if (modelo.equalsIgnoreCase("Cruze")) {
        preco = 150000;
        ano = 2020;
    }else{
        System.out.println("Modelo incorreto.");
    }
}
public Carro(String modelo, Integer ano, Integer preco){
    this.modelo = modelo;
    this.ano = ano;
    this.preco = preco;

}
public Carro (){
}
    void imprimir(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);

    }

    public Integer getPreco(){
    return preco;
    }


}
