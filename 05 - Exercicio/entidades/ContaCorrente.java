package entidades;

public class ContaCorrente extends ContaBancaria {
	private double limite;

	// Construtor
	public ContaCorrente(String nomeCliente, String numConta, double saldoInicial, double limite) {
		super(nomeCliente, numConta, saldoInicial);
		this.limite = limite;
	}

	// Getter e Setter para limite
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// Redefinição do método sacar permitindo saldo negativo até o limite
	@Override
	public boolean sacar(double valorDeSaque) {
		double saldoDisponivel;

		if (valorDeSaque <= 0) {
			System.out.println("Valor de saque inválido!");
			return false;
		}
		saldoDisponivel = saldo + limite;

		if (valorDeSaque > saldoDisponivel) {           // se o saque excede o saldo disponível
			System.out.println("Saque excede o limite permitido!");
			return false;
		}

		saldo = saldo  - valorDeSaque;                          // realiza o saque
		System.out.println("Saque de R$ " + valorDeSaque + " realizado com sucesso.");
		return true;
	}

	// Sobrescrita de mostrarDados para incluir limite
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Limite: R$ " + limite);
	}
}