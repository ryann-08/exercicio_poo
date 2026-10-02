package exercicio18_bonificacaoHeranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 1 para FUNCIONARIO e 2 para GERENTE");
        int opcao = entrada.nextInt();

        if(opcao == 1){
            Funcionario f = new Funcionario();
            System.out.println("Digite seu nome: ");
            f.setNome(entrada.next());

            System.out.println("Digite o seu salario: ");
            f.setSalario(entrada.nextDouble());

            System.out.println("Nome: " + f.getNome());
            System.out.println("Bonificação: " + f.calcularBonificacao());
        }
        else if (opcao == 2) {
            Gerente g = new Gerente();
            System.out.println("Digite seu nome: ");
            g.setNome(entrada.next());

            System.out.println("Digite seu salario: ");
            g.setSalario(entrada.nextDouble());

            System.out.println("Nome: " + g.getNome());
            System.out.println("Bonificação: " + g.calcularBonificacao());
        }
        else {
            System.out.println("VALOR INVALIDO");
        }
        entrada.close();
    }

}
