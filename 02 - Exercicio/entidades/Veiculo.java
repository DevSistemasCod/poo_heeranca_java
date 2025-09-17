public class Veiculo {
    protected String marca;
    protected int ano;

    // Construtor obrigatório
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para mostrar informações
    public void mostraInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}
