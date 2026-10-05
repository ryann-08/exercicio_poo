package exercicico25_ValidacaoDupla_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_validacao {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //fase 1
        // ve se o ano do filme é valido
        boolean filmeValido = false;
        do {
            try {
                System.out.println("Digite o ano de lancamento do filme: ");
                int anoLancamento = entrada.nextInt();

                //primeiro teste ve se, o numero digitado entra nesses criterios
                if (anoLancamento < 1895 || anoLancamento > 2026){
                    System.out.println("Data do ano de lancamento invalida! Digite um ano entre (1895 e 2026" +
                            ")");
                }
                // caso entra vem parar aqui
                else{
                    System.out.println("Filme lançado em: " + anoLancamento);

                    filmeValido = true;
                }
            }
            //caso o usuario digita, letras ou qualquer outra coisa que nao seja numero cai aqui
            catch (InputMismatchException erro){
                System.out.println("ERRO, DIGITE APENAS NUMEROS!");

                //limpando o buffer, sempre fica um tecla invisivel e cai no loop infinito
                entrada.nextLine();
            }
        }
        //mudando de false para true, caso nao de certo ele repete, se de certo ele nao repete
        while (!filmeValido);


        //fase 2
        boolean idadeValida = false;
        do {
            try {
                //pedindo para o usuario digitar
                System.out.println("Digite a idade indicativa do filme: ");
                int idadeIndicativa = entrada.nextInt();

                //caso digite um numero, passa nesse parametro para saber se o numero se encaixa no que precisamos
                if (idadeIndicativa < 0 || idadeIndicativa > 18){
                    System.out.println("ERRO, tem que ser entre 0 a 18");

                    //adicionei uma ocasiao a mais, filmes de ate 12 anos sao livres para todo mundo
                } else if (idadeIndicativa >= 0 && idadeIndicativa <= 12) {
                    System.out.println("idade indicativa é livre para todos os publicos ");

                    idadeValida = true;
                }
                //caso seja maior que 12, ja tem restricao de idade
                else {
                    System.out.println("Idade indicativa para pesoas com: " + idadeIndicativa + " anos, ou mais. ");

                    idadeValida = true;
                }
            }
            //caso nao tenha digitado numeros, vem pra ca, e aparece esse erro
            catch (InputMismatchException erro){
                System.out.println("ERRO! Digite apenas numeros ");

                //limpando o buufer igual na partre de cima do codigo
                entrada.nextLine();
            }
        }
        //aqui inverte a condicao, ai decide se para ou nao atraves do tipo de informacao que vem
        while(!idadeValida);


    }
}
