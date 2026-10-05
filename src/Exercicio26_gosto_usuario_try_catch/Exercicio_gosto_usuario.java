package Exercicio26_gosto_usuario_try_catch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio_gosto_usuario {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean comediaValido = false;
        int notaComedia = 0;
        do {
            try {
                System.out.println("Digita de 0 a 5, o quanto voce gota do genero COMÉDIA: ");
                 notaComedia = entrada.nextInt();

                if (notaComedia < 0 || notaComedia > 5){
                    System.out.println("Numero invalido!!!");
                }
                else {
                    System.out.println("nota digitada foi: " + notaComedia);

                    comediaValido = true;
                }
            }
            catch (InputMismatchException erro){
                System.out.println("ERRO, SO ACEITAMOS NUMEROS!!! ");

                entrada.nextLine();
            }
        }
        while(!comediaValido);


        //fase2
        boolean acaoValido = false;
        int notaAcao = 0;
        do {
            try {
                System.out.println("Digita de 0 a 5, o quanto voce gota do genero AÇÃO: ");
                notaAcao = entrada.nextInt();

                if (notaAcao < 0 || notaAcao > 5){
                    System.out.println("Numero invalido!!!");
                }
                else {
                    System.out.println("nota digitada foi: " + notaAcao);

                    acaoValido = true;
                }
            }
            catch (InputMismatchException erro){
                System.out.println("ERRO, SO ACEITAMOS NUMEROS!!! ");

                entrada.nextLine();
            }
        }
        while(!acaoValido);

        //fase3

        // pegando a nota de cada genero e dividindo (normalização: convertendo as notas (0 a 5)
        // para escala proporcional (0.0 a 1.0)
        double[] vetorPerfil = {notaComedia / 5.0, notaAcao / 5.0};

        System.out.println("o perfil final do usuario é: ");
        System.out.println("Comedia: " + vetorPerfil[0]);
        System.out.println("Ação: " + vetorPerfil[1]);

        //o (0) e o (1) dentro dos [] é para sinalizar onde deve proucurar na lista
        }
    }

