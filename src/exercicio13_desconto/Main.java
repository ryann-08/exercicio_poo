package exercicio13_desconto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Produto meuProduto = new Produto();

        //receber informações
        System.out.println("Digite o nome do produto: ");
        meuProduto.nome = entrada.nextLine();

        System.out.println("Digite o valor do produto: ");
        meuProduto.preco = entrada.nextDouble();

        //chamando o metodo 1 sem parametro
        System.out.println("\n--- SITUAÇÃO DA CONTA ---");
        String informacoes = meuProduto.exibirDados();
        System.out.println(informacoes);

        //chamando metodo 2 com 1 parametro - recebendo o valor de desconto
        System.out.println("Digite o valor de desconto: ");
        double descontoDigitado = entrada.nextDouble();
        meuProduto.aplicarDesconto(descontoDigitado);

        //mostrando na tela resultado final
        System.out.println("---- DADOS APÓS DESCONTO ----");
        System.out.println(meuProduto.exibirDadosAtualizado());

        entrada.close();


    }
}
