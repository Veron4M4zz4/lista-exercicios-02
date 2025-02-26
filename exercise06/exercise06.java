import java.util.Scanner;

public class ContaBancaria {
    private final int numeroConta;
    private String nomeTitular;
    private double saldo;
    private static final double TAXA_SAQUE = 5.00;

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = depositoInicial;
    }

    public void setNomeTitular(String nome) {
        this.nomeTitular = nome;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
    }

    public void sacar(double valor) {
        saldo -= (valor + TAXA_SAQUE);
        System.out.printf("Saque de R$ %.2f realizado! Taxa de R$ %.2f aplicada.\n", valor, TAXA_SAQUE);
    }

    public void exibirDados() {
        System.out.printf("Conta %d, Nome do Titular: %s, Saldo: R$ %.2f\n", numeroConta, nomeTitular, saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Informe o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Haverá um depósito inicial (s/n)? ");
        char resposta = scanner.next().charAt(0);

        double depositoInicial = 0.0;
        if (resposta == 's' || resposta == 'S') {
            System.out.print("Informe o valor do depósito inicial: ");
            depositoInicial = scanner.nextDouble();
        }

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
        conta.exibirDados();

        System.out.print("Informe um valor de depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        conta.exibirDados();

        System.out.print("Informe um valor de saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);
        conta.exibirDados();

        scanner.close();
    }
}
