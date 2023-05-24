package OrientadoObjeto;

public class Retangulo extends Figura {
    private double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        double area = base * altura;
        return  area;


    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

}
