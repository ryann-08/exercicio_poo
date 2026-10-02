package exercicio06_idade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        int idadeDias = idade * 365;

        System.out.println("Sua idade em dias é: " + idadeDias);
        entrada.close();
    }

}
