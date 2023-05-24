package OrientadoObjeto;

public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        double area = Math.PI * Math.pow(raio, 2);
        return area;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI * raio;
        return perimetro;

    }
}
