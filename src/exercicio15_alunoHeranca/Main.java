package exercicio15_alunoHeranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno1.setNome(entrada.nextLine());

        System.out.println("Digite a 1 nota do aluno: ");
        aluno1.setNota(entrada.nextDouble());

        System.out.println("Digite a 2 nota do aluno: ");
        aluno1.setNota2(entrada.nextDouble());

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Media: " + aluno1.calcularMedia());
    }
}
