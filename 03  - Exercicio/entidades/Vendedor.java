package entidades;

// Subclasse Vendedor
public class Vendedor extends Funcionario {
    private double salarioBase;
    private double totalVendas;

    public Vendedor(String nome, String rg, double valorHora, int horasTrabalhadas, double salarioBase) {
        super(nome, rg, valorHora, horasTrabalhadas);
        this.salarioBase = salarioBase;
        this.totalVendas = 0.0;
    }

    // Acumula valor de vendas
    public void acumularVenda(double valor) {
        this.totalVendas += valor;
    }

    @Override
    public double calcularHolerite() {
        double salarioTrabalho = super.calcularHolerite();
        double comissao = totalVendas * 0.05; // 5% sobre as vendas
        return salarioBase + salarioTrabalho + comissao;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Total de vendas: R$ " + totalVendas);
        System.out.println("Salário total (com comissão): R$ " + calcularHolerite());
    }
}
