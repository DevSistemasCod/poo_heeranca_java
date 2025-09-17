package entidades;

public class LivroDeNaoFiccao extends Livro {
    private String tema;
    private String topico;

    public LivroDeNaoFiccao(String titulo, String autor, int numeroPaginas, String tema, String topico) {
        super(titulo, autor, numeroPaginas);
        this.tema = tema;
        this.topico = topico;
    }

    public void recomendarOutrosTitulos() {
        System.out.println("Se você gosta de " + tema + ", recomendamos explorar livros sobre " + topico + " de outros autores.");
    }

    @Override
    public void informarDetalhes() {
        super.informarDetalhes();
        System.out.println("Tema: " + tema);
        System.out.println("Tópico: " + topico);
    }
}

