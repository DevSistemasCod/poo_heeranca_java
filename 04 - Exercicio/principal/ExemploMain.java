package principal;

import entidades.Produto;
import entidades.ProdutoImportado;

import java.util.Scanner;

public class ExemploMain {
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);

		System.out.print("Quantos produtos deseja cadastrar? ");
		int qtdProdutos = lerTeclado.nextInt();
		lerTeclado.nextLine(); // consumir quebra de linha

		Produto[] produtos = new Produto[qtdProdutos];

		for (int i = 0; i < qtdProdutos; i++) {
			System.out.println("\nCadastro do produto #" + (i + 1));
			System.out.print("Deseja cadastrar um Produto comum (1) ou Produto Importado (2)? ");
			int opcao = lerTeclado.nextInt();
			lerTeclado.nextLine();

			System.out.print("Nome: ");
			String nome = lerTeclado.nextLine();

			System.out.print("Preço: ");
			double preco = lerTeclado.nextDouble();

			System.out.print("Quantidade em estoque: ");
			int quantidade = lerTeclado.nextInt();

			if (opcao == 1) {
				produtos[i] = new Produto(nome, preco, quantidade);
			} else {
				System.out.print("Taxa de importação (em decimal, ex: 0.1 para 10%): ");
				double taxa = lerTeclado.nextDouble();
				produtos[i] = new ProdutoImportado(nome, preco, quantidade, taxa);
			}
		}

		// Exibir dados
		double totalEstoque = 0.0;
		System.out.println("\n=== RELATÓRIO DE PRODUTOS ===");
		for (Produto produto : produtos) {
			produto.mostrarDados();
			System.out.println("----------------------------");
			totalEstoque = totalEstoque +  produto.calcularValorTotalEstoque();
		}

		System.out.println("Valor total em estoque de todos os produtos: R$ " + totalEstoque);

		lerTeclado.close();
	}
}
