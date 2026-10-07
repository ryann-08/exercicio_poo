package exercicio27_duracao_filme_try_catch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio_duracao_filme {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean validacaoFilme = false;
        int resultado = 0;
        int resultadoMinutos = 0;

        do{
            try {
                System.out.println("Digite a duracao do filme em minutos");
                int minutos = entrada.nextInt();

                if (minutos <= 0 || minutos > 300){
                    System.out.println("ERRO, digite de 1min a 300min");
                }
                else if (minutos >= 60 && minutos <= 300){
                    resultado = minutos / 60;
                    resultadoMinutos = minutos % 60;
                    System.out.println("filme de " + minutos + " minutos tem: " + resultado + " hora de duracao e " + resultadoMinutos + " minutos" );

                    validacaoFilme = true;
                }
                else{
                    System.out.println("o filme tem: " + minutos + " minutos de duracao");

                    validacaoFilme = true;
                }

            } catch (InputMismatchException erro){
                System.out.println("ERRO, digite apenas numeros!!!");

                entrada.nextLine();
            }
        }
        while (!validacaoFilme);
    }
}
