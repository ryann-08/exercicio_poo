package exercicio21_chocolates_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_chocolate {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int valorFixoChocolate = 10;

        try{
            System.out.println("Digite a quantidade de chocolates que vc vai comprar: ");
            int quantidade = entrada.nextInt();
            int valorFinal = quantidade * valorFixoChocolate;
            System.out.println("Valor final a pagar: " + valorFinal);

        }catch (InputMismatchException erro){
            System.out.println("ERRO! DIGITE APENAS NUMEROS!!!");
        }
    }
}
