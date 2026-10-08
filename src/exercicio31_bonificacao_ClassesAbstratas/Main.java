package exercicio31_bonificacao_ClassesAbstratas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDigitado = entrada.nextLine();

        System.out.println("Digite seu salario: ");
        double salarioDigitado = entrada.nextInt();

        Gerente meuGerente = new Gerente(nomeDigitado, salarioDigitado);

        System.out.println("o senhor(a):  " + nomeDigitado);
        System.out.println("ira recerber a bonificacao de: " + meuGerente.calcularBonificacao());

    }
}
