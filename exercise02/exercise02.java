import java.util.Scanner;


public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt((largura * largura) + (altura * altura));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a largura e altura do retângulo:");
        double largura = scanner.nextDouble();
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.printf("Área = %.2f\n", retangulo.calcularArea());
        System.out.printf("Perímetro = %.2f\n", retangulo.calcularPerimetro());
        System.out.printf("Diagonal = %.2f\n", retangulo.calcularDiagonal());

        scanner.close();
    }
}
