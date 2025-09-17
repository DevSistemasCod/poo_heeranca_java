package entidades;

public class ContaBancaria {
	protected String nomeCliente;
	protected String numConta;
	protected double saldo;

	// Construtor
	public ContaBancaria(String nomeCliente, String numConta, double saldoInicial) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldoInicial;
	}

	// Método para sacar dinheiro (saldo não pode ficar negativo)
	public boolean sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de saque inválido!");
			return false;
		}
		if (valor > saldo) {
			System.out.println("Saldo insuficiente para saque!");
			return false;
		}
		saldo = saldo - valor;
		System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		return true;
	}

	// Método para depositar dinheiro
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de depósito inválido!");
			return;
		}
		saldo = saldo + valor;
		System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
	}

	// Getter para saldo
	public double getSaldo() {
		return saldo;
	}

	// Método para exibir informações da conta
	public void mostrarDados() {
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("Número da conta: " + numConta);
		System.out.println("Saldo: R$ " + saldo);
	}
}
