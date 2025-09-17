// Classe Carro herdando de Veiculo
public class Carro extends Veiculo {
    private int numeroDePortas;
    private String tipoCombustivel;

    // Construtor para inicializar todos os atributos
    public Carro(String marca, int ano, int numeroDePortas, String tipoCombustivel) {
        super(marca, ano); // Chama o construtor da superclasse
        this.numeroDePortas = numeroDePortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getters e Setters
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    // Sobrescrita do método mostraInfo()
    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chama a versão da superclasse
        System.out.println("Número de portas: " + numeroDePortas);
        System.out.println("Tipo de combustível: " + tipoCombustivel);
    }
}
