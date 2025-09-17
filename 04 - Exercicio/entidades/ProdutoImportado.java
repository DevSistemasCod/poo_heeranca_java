package entidades;

public class ProdutoImportado extends Produto {
    private double taxaImportacao;

    // Construtor
    public ProdutoImportado(String nome, double preco, int quantidadeEstoque, double taxaImportacao) {
        super(nome, preco, quantidadeEstoque);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    // Sobrescrevendo método mostrarDados
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de importação: " + (taxaImportacao * 100) + "%");
        System.out.println("Valor final com taxa: R$ " + (this.preco + this.preco * taxaImportacao));
        System.out.println("Valor total em estoque (com taxa): R$ " + calcularValorTotalEstoque());
    }

    // Sobrescrevendo método calcularValorTotalEstoque
    @Override
    public double calcularValorTotalEstoque() {
        double precoComTaxa = this.preco + (this.preco * taxaImportacao);
        return precoComTaxa * this.quantidadeEstoque;
    }
}