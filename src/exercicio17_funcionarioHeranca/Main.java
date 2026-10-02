package exercicio17_funcionarioHeranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        Gerente meuGerente = new Gerente();

        System.out.println("Digite seu nome: ");
        meuGerente.setNome(entrada.nextLine());

        System.out.println("Digite seu salario base: ");
        meuGerente.setSalarioBase(entrada.nextDouble());

        System.out.println("Digite seu bonus: ");
        meuGerente.setBonus(entrada.nextDouble());

        System.out.println("O seu nome é: " + meuGerente.getNome());
        System.out.println("Seu salario com a bonificação é: " + meuGerente.calcularSalarioTotal());
        entrada.close();
    }
}
