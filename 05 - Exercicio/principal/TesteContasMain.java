package principal;

import entidades.ContaCorrente;
import entidades.ContaPoupanca;

import java.util.Scanner;

public class TesteContasMain {
    public static void main(String[] args) {
        // --- Criando uma Conta Corrente ---
        ContaCorrente cc = new ContaCorrente("João Silva", "12345-6", 1000.0, 500.0);

        System.out.println("=== Conta Corrente Inicial ===");
        cc.mostrarDados();

        // Testando saque
        System.out.println("\nTentando sacar R$ 1200,00 da conta corrente...");
        cc.sacar(1200.0); // deve permitir (saldo 1000 + limite 500 = 1500)

        // Testando depósito
        System.out.println("\nDepositando R$ 300,00 na conta corrente...");
        cc.depositar(300.0);

        System.out.println("\n=== Conta Corrente Atualizada ===");
        cc.mostrarDados();

        // --- Criando uma Conta Poupança ---
        ContaPoupanca cp = new ContaPoupanca("Maria Souza", "98765-4", 2000.0, 10);

        System.out.println("\n=== Conta Poupança Inicial ===");
        cp.mostrarDados();

        // Testando saque
        System.out.println("\nTentando sacar R$ 500,00 da poupança...");
        cp.sacar(500.0);

        // Testando depósito
        System.out.println("\nDepositando R$ 200,00 na poupança...");
        cp.depositar(200.0);

        System.out.println("\n=== Conta Poupança Antes do Rendimento ===");
        cp.mostrarDados();

        // Testando rendimento (considerando que hoje é o dia 10)
        int diaAtual = 10;
        double taxaRendimento = 0.005; // 0,5%
        System.out.println("\nCalculando rendimento da poupança no dia " + diaAtual + "...");
        cp.calcularNovoSaldo(taxaRendimento, diaAtual);

        System.out.println("\n=== Conta Poupança Após Rendimento ===");
        cp.mostrarDados();
    }
}

