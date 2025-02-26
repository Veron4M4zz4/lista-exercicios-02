import java.util.Scanner;

public class Estudante {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudante(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean verificarAprovacao() {
        return calcularNotaFinal() >= 60.0;
    }

    public double calcularPontosFaltantes() {
        double pontosFaltando = 60.0 - calcularNotaFinal();
        return pontosFaltando > 0 ? pontosFaltando : 0;
    }

    public void exibirResultado() {
        double notaFinal = calcularNotaFinal();
        System.out.printf("Nota Final: %.2f\n", notaFinal);

        if (verificarAprovacao()) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f pontos\n", calcularPontosFaltantes());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);
        estudante.exibirResultado();

        scanner.close();
    }
}
