package exercicio12_conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        // 1. Instanciar o objeto da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        // 2 Pedir os dados iniciais do titular e saldo
        System.out.println("--- CADASTRO DE CONTA ---");
        System.out.print("Digite o nome do titular: ");
        conta.titular = entrada.nextLine();

        System.out.print("Digite o saldo inicial: ");
        conta.saldo = entrada.nextDouble();

        // 3. Chamando o método 1 (exibirSaldo - sem parâmetro)
        System.out.println("\n--- SITUAÇÃO DA CONTA ---");
        String informacoes = conta.exibirSaldo();
        System.out.println(informacoes);

        // 4. Chamando o método 2 (depositar - com 1 parâmetro)
        System.out.println("\n--- OPERAÇÃO DE DEPÓSITO ---");
        System.out.print("Digite quanto deseja depositar: ");
        double valorParaDepositar = entrada.nextDouble();

        // Passando a variável 'valorParaDepositar' como parâmetro!
        conta.depositar(valorParaDepositar);

        // Chamamos o exibirSaldo de novo para confirmar que o saldo mudou
        System.out.println("\nApós o depósito:");
        System.out.println(conta.exibirSaldo());

        // 5. Chamando o método 3 (calcularEmprestimo - com 2 parâmetros)
        System.out.println("\n--- SIMULAÇÃO DE EMPRÉSTIMO ---");
        System.out.print("Digite o valor do empréstimo pretendido: ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Digite a taxa de juros (%): ");
        double taxaJuros = entrada.nextDouble();

        // Passando DUAS variáveis como parâmetro!
        double totalAPagar = conta.calcularEmprestimo(valorEmprestimo, taxaJuros);

        System.out.println("Valor total a pagar no final: R$ " + totalAPagar);

        entrada.close();
    }
}
