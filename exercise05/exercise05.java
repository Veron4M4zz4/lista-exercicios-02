import java.util.Scanner;

public class ConversorMoeda {
    private double cotacaoDolar;
    private double valorDolar;
    private static final double IOF = 0.06; // 6% de IOF

    public ConversorMoeda(double cotacaoDolar, double valorDolar) {
        this.cotacaoDolar = cotacaoDolar;
        this.valorDolar = valorDolar;
    }

    public double calcularValorEmReais() {
        double valorSemIOF = cotacaoDolar * valorDolar;
        double valorComIOF = valorSemIOF + (valorSemIOF * IOF);
        return valorComIOF;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o preço do dólar? ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double valorDolar = scanner.nextDouble();

        ConversorMoeda conversor = new ConversorMoeda(cotacaoDolar, valorDolar);
        
        System.out.printf("Valor a ser pago em reais = %.2f\n", conversor.calcularValorEmReais());
        
        scanner.close();
    }
}
