package principal;

import entidades.Administrativo;
import entidades.Vendedor;

public class MainFunc {
    public static void main(String[] args) {
        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Carlos Silva", "1234567", 20.0, 160, 1500.0);
        vendedor.acumularVenda(10000.0);
        vendedor.acumularVenda(5000.0);

        // Criando um administrativo
        Administrativo administrativo = new Administrativo("Maria Souza", "7654321", 25.0, 160);
        administrativo.acumularHoraExtra(10);

        // Mostrando dados
        System.out.println("=== Dados do Vendedor ===");
        vendedor.mostraDados();

        System.out.println("\n=== Dados do Administrativo ===");
        administrativo.mostraDados();
    }
}