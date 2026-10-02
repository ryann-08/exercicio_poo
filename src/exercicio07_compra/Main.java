package exercicio07_compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra: ");
        double compra = entrada.nextDouble();

        System.out.println("Digite o valor de desconto em reais: ");
        double desconto = entrada.nextDouble();

        double valorFinal = compra - desconto;

        System.out.println("Valor final a pagar é " + valorFinal);
        entrada.close();
    }
}
