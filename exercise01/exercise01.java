import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade + " unidades");
        System.out.println("Total: R$" + (preco * quantidade));
    }

    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
        System.out.println("Adicionadas " + qtd + " unidades ao estoque.");
    }

    public void removerEstoque(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Removidas " + qtd + " unidades do estoque.");
        } else {
            System.out.println("Erro: Estoque insuficiente!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do produto:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produto.exibirDetalhes();

        System.out.print("Produtos a adicionar: ");
        int qtdAdicionar = scanner.nextInt();
        produto.adicionarEstoque(qtdAdicionar);
        produto.exibirDetalhes();

        System.out.print("Produtos a remover: ");
        int qtdRemover = scanner.nextInt();
        produto.removerEstoque(qtdRemover);
        produto.exibirDetalhes();

        scanner.close();
    }
}
