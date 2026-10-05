package exercicio22_entrada_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_entrada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean entradaValida = false;
        int precoFixo = 15;
        do {
            try{
                System.out.println("Digite a quantidade de chocolates: ");
                int quantidadeChocolates = entrada.nextInt();
                int valorFinal = quantidadeChocolates * precoFixo;
                System.out.println("Valor total a pagar: " + valorFinal);
                entradaValida = true;
            }catch (InputMismatchException erro){
                System.out.println("ERRO, DIGITE APENAS NUMEROS INTEIROS");

                entrada.nextLine();
            }

        } while (!entradaValida);

    }
}
