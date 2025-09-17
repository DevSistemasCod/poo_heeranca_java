package entidades;

// Subclasse Administrativo
public class Administrativo extends Funcionario {
    private int horasExtras;

    public Administrativo(String nome, String rg, double valorHora, int horasTrabalhadas) {
        super(nome, rg, valorHora, horasTrabalhadas);
        this.horasExtras = 0;
    }

    // Acumula horas extras
    public void acumularHoraExtra(int horas) {
        this.horasExtras += horas;
    }

    @Override
    public double calcularHolerite() {
        double salarioTrabalho = super.calcularHolerite();
        double adicionalHoraExtra = horasExtras * (valorHora / 100.0); // 1% do valorHora por hora extra
        return salarioTrabalho + adicionalHoraExtra;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Salário total (com hora extra): R$ " + calcularHolerite());
    }
}
