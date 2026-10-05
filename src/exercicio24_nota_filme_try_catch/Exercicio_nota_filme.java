package exercicio24_nota_filme_try_catch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio_nota_filme {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean notaValida = false;

        do {
            try {
                System.out.println("Digite a nota do filme assistido, (0.0 a 10)");
                double notaFilme = entrada.nextDouble();

                if (notaFilme < 0 || notaFilme > 10){
                    System.out.println("ERRO NOTA INVALIDA");
                }
                else {
                    System.out.println("Nota registrada em nota: " + notaFilme);

                    notaValida = true;
                }
            }
            catch (InputMismatchException erro){
                System.out.println("ERRO, DIGITE APENAS NUMEROS DE 0 A 10");

                entrada.nextLine();

            }
        }
        while (!notaValida);
    }
}
