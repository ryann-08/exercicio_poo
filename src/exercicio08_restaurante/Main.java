package exercicio08_restaurante;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite a quantidade de pessoas no restaurante: ");
        int pessoas = entrada.nextInt();

        System.out.println("Digite o valor total a pagar: ");
        double valorTotal = entrada.nextDouble();

        double valorFinal = valorTotal / pessoas;

    System.out.println("O valor final que cada pessoa deverá pagar é: " + valorFinal);

    entrada.close();
    }

}
