import dadosdoproduto.Produto;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {
    public static void main(String[] args) {

Scanner scanner= new Scanner(System.in);

   Produto produto = new Produto();

        System.out.println("insira os dados do produto");

        System.out.println("nome do produto");
        produto.nome = scanner.nextLine();

        System.out.println("preco do produto");
        produto.preco = scanner.nextDouble();

        System.out.println("quantidade no estoque");
        produto.quantidade = scanner.nextInt();

        System.out.println("dados do produto: " );
        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.quantidade);
        System.out.println(produto);

        System.out.println();
        System.out.println("adicionar produtos no estoque: ");
        int quantidade = scanner.nextInt();
        produto.adicionarprodutos(quantidade);

        System.out.println();
        System.out.println("dados atualizados: " + produto);

        System.out.println();
        System.out.println("remover produtos do estoque: ");
        int quantidadeRemover= scanner.nextInt();
        produto.removerprodutos(quantidade);

        System.out.println();
        System.out.println("dados atualizados: " + produto);
    }
}
