package exercicio24_nota_filme_try_catch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio_nota_filme {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //comeca em falso, e obrigatoriamente ele passa no try ao menos 1 vez
        boolean notaValida = false;

        do {
            try {
                System.out.println("Digite a nota do filme assistido, (0.0 a 10)");
                double notaFilme = entrada.nextDouble();

                //se o usuario digitar um numero, esta certo, mas esse numero tem que ser de 0 a 10 - por isso o if
                if (notaFilme < 0 || notaFilme > 10){
                    System.out.println("ERRO NOTA INVALIDA");
                }

                //caso tenha digitado certo, ja pula pra ca
                else {
                    System.out.println("Nota registrada em nota: " + notaFilme);

                    //inverte para verdadeiro, para nao passar mais no loop
                    notaValida = true;
                }
            }
            //caso nao tenha digitado nenhum numero, vem pra ca, nem cai no if
            catch (InputMismatchException erro){
                System.out.println("ERRO, DIGITE APENAS NUMEROS DE 0 A 10");

                entrada.nextLine();

            }
        }
        //"!" = diferente, entao ele muda se for verdadeiro la no else muda para falso e nao repete mais o loop
        while (!notaValida);
    }
}
