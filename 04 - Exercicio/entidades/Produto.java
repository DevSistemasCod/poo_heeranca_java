package entidades;

public class Produto {
	protected String nome;
	protected double preco;
	protected int quantidadeEstoque;

	// Construtor
	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	// Método para exibir dados
	public void mostrarDados() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEstoque);
		System.out.println("Valor total em estoque: R$ " + calcularValorTotalEstoque());
	}

	// Método para calcular o valor total em estoque
	public double calcularValorTotalEstoque() {
		return preco * quantidadeEstoque;
	}
}
