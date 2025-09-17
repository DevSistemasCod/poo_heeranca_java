package entidades;

public class ContaPoupanca extends ContaBancaria {
	private int diaDeRendimento;

	// Construtor
	public ContaPoupanca(String nomeCliente, String numConta, double saldoInicial, int diaDeRendimento) {
		super(nomeCliente, numConta, saldoInicial);
		this.diaDeRendimento = diaDeRendimento;
	}

	// Getter e Setter
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	/**
	 * Calcula o novo saldo da poupança se for o dia de rendimento.
	 *  taxa - taxa de rendimento em decimal (ex: 0.005 para 0,5%)
	 *  diaAtual - dia atual do mês
	 */
	public void calcularNovoSaldo(double taxa, int diaAtual) {
		if (diaAtual == diaDeRendimento) {
			double rendimento = saldo * taxa;
			saldo = saldo + rendimento;
			System.out.println("Rendimento de R$ " + rendimento + " creditado na poupança.");
		} else {
			System.out.println("Hoje não é o dia de rendimento da poupança.");
		}
	}

	// Sobrescrita do mostrarDados para incluir dia de rendimento
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Dia de rendimento: " + diaDeRendimento);
	}
}
