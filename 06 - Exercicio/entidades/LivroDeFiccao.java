package entidades;

public class LivroDeFiccao extends Livro {
    private String genero;
    private String subgenero;

    public LivroDeFiccao(String titulo, String autor, int numeroPaginas, String genero, String subgenero) {
        super(titulo, autor, numeroPaginas);
        this.genero = genero;
        this.subgenero = subgenero;
    }

    public void sinopseDoLivro() {
        System.out.println("Sinopse: Este é um livro de " + genero + " com subgênero " + subgenero + ".");
    }

    @Override
    public void informarDetalhes() {
        super.informarDetalhes();
        System.out.println("Gênero: " + genero);
        System.out.println("Subgênero: " + subgenero);
    }
}