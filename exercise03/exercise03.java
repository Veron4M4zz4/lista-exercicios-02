import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double percentual) {
        salarioBruto += salarioBruto * (percentual / 100);
    }

    public void exibirDados() {
        System.out.printf("Empregado: %s, R$ %.2f\n", nome, calcularSalarioLiquido());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Salário Bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Imposto: ");
        double imposto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
        funcionario.exibirDados();

        System.out.print("Qual o percentual de aumento do salário? ");
        double percentual = scanner.nextDouble();
        funcionario.aumentarSalario(percentual);
        funcionario.exibirDados();

        scanner.close();
    }
}
