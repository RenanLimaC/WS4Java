package OrientadoObjeto;
// Crie uma hierarquia de classes para figuras geométricas, começando com uma classe "Figura".
// Em seguida, crie três classes filhas: "Retângulo", "Círculo" e "Triângulo".
// Cada classe deve ter seus próprios métodos para calcular a áreae o perímetro.
// Em seguida, crie um objeto de cada classe e exiba sua área e perímetro na tela.
public class Exercicio3 {
    public static void main(String[] args) {
        Figura triangulo = new Triangulo(3, 5, 2, 1, 2);
        Figura retangulo = new Retangulo(5, 9);
        Figura circulo = new Circulo (2);

        System.out.println("A area do triangulo é: " + triangulo.calcularArea());
        System.out.println("O perimetro do triangulo é: " + triangulo.calcularPerimetro());
        System.out.println("A area do retangulo é: " + retangulo.calcularArea());
        System.out.println("O perimetro do retangulo é: " + retangulo.calcularPerimetro());
        System.out.println("A area do circulo é: " + circulo.calcularArea());
        System.out.println("O perimetro do circulo é: " + circulo.calcularPerimetro());


        }
    }


