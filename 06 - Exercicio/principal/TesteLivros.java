package principal;

import entidades.LivroDeFiccao;
import entidades.LivroDeNaoFiccao;
import entidades.LivroDidatico;

public class TesteLivros {
	public static void main(String[] args) {
		// Livro Didático
		LivroDidatico livro1 = new LivroDidatico("Matemática Básica", "Ana Souza", 300, "Matemática", 8, "Ensino Fundamental");
		livro1.informarDetalhes();
		System.out.println("Compatível com 8º ano? " + livro1.verificarCompatibilidade(8));
		System.out.println();

		// Livro de Ficção
		LivroDeFiccao livro2 = new LivroDeFiccao("Guerra Espacial", "João Lima", 450, "Guerra", "Espacial");
		livro2.informarDetalhes();
		livro2.sinopseDoLivro();
		System.out.println();

		// Livro de Não Ficção
		LivroDeNaoFiccao livro3 = new LivroDeNaoFiccao("Matemática Avançada", "Carlos Pereira", 500, "Matemática", "Números Complexos");
		livro3.informarDetalhes();
		livro3.recomendarOutrosTitulos();
	}
}
