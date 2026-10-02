package exercicio09_temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        double graus = entrada.nextDouble();

        double fahrenheit = (graus * 1.8) + 32;

        System.out.println("o valor em fahrenheit é: " + fahrenheit);

        entrada.close();
    }

}
