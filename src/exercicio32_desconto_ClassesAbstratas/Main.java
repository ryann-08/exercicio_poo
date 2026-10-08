package exercicio32_desconto_ClassesAbstratas;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o nome do prato: ");
        String nomeDigitado = entrada.nextLine();

        System.out.println("digite o preco do prato: ");
        double precoDigitado = entrada.nextDouble();

        PratoPromocional meuPrato = new PratoPromocional(nomeDigitado, precoDigitado);

        System.out.println("o seu prato de " + nomeDigitado);
        System.out.println("teve um desconto, e vai pagar: " + meuPrato.calcularPrecoComDesconto());
    }
}
