package OrientadoObjeto;

public class Triangulo extends Figura {

    private double base, altura, ladoA, ladoB, ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo() {
    }
    @Override
    public double calcularArea() {
        double area = base * altura / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = ladoA + ladoB + ladoC;
        return perimetro;

    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", ladoC=" + ladoC +
                '}';
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

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }






}
