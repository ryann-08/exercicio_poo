package exercicio19_ingressoHeranca;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite 1 para INGRESSO COMUM ou 2 PARA INGRESSO VIP");
        int opcao = entrada.nextInt();

        if (opcao == 1){
            Ingresso i = new Ingresso();
            System.out.println("Digite o valor do seu ingresso");
            i.setValor(entrada.nextInt());

            System.out.println("Valor do ingresso ficou " + i.calcularValorFinal() + "voce nao tem acesso ao vip");
        } else if (opcao == 2) {
            IngressoVip v = new IngressoVip();
            System.out.println("Digite o valor do seu ingresso");
            v.setValor(entrada.nextInt());

            System.out.println("Valor final ficou: " + v.calcularValorFinal() + "voce tem acesso ao vip");
        }
        else {
            System.out.println("opcao indisponivel");
        }
        entrada.close();
    }

}
