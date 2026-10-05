package exercicio23_validacao_idade_try_catch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio_validacao_idade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean idadeValida = false;

        do {
            try {
                System.out.println("Digite a sua idade: ");
                int idade = entrada.nextInt();

                if (idade <= 0 || idade > 120){
                    System.out.println("ERRO, IDADE INVALIDA");
                }else {
                    System.out.println("idade cadastrada sua idade é: " + idade + " anos");

                    idadeValida = true;
                }
            }
            catch(InputMismatchException erro){
                System.out.println("ERRO DIGITE APENAS NUMEROS!!!");

                entrada.nextLine();
            }
        }while(!idadeValida);


    }
}
