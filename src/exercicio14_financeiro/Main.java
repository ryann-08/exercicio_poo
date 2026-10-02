package exercicio14_financeiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria();

        System.out.println("Digite seu nome: ");
        minhaConta.titular = entrada.nextLine();

        minhaConta.saldo = 1000;

        System.out.println("Digite o valor que vai sacar: ");
        double valorSaque = entrada.nextDouble();
        minhaConta.sacar(valorSaque);
    }
}
