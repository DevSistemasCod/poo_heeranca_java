package entidades;

public class Livro {
	protected String titulo;
	protected String autor;
	protected int numeroPaginas;

	// Construtor
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	// Método para exibir detalhes do livro
	public void informarDetalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Número de páginas: " + numeroPaginas);
	}
}