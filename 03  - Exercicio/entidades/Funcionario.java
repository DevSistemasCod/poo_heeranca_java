package entidades;
public class Funcionario {
    protected String nome;
    protected String rg;
    protected double valorHora;
    protected int horasTrabalhadas;

    // Construtor
    public Funcionario(String nome, String rg, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.rg = rg;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Método para calcular holerite (básico)
    public double calcularHolerite() {
        return valorHora * horasTrabalhadas;
    }

    public void mostraDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor da hora: R$ " + valorHora);
    }
}
