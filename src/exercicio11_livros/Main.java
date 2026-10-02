package exercicio11_livros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Livros meuLivros = new Livros();

        System.out.println("Digite o titulo do livro: ");
        meuLivros.titulo = entrada.nextLine();

        System.out.println("Digite o nome do autor: ");
        meuLivros.autor = entrada.nextLine();

        System.out.println("Digite a quantidades de paginas em numeros: ");
        meuLivros.paginas = entrada.nextInt();

        System.out.println("Digite o valor do livro, em reais: ");
        meuLivros.preco = entrada.nextDouble();

        System.out.println(meuLivros.obterDetalhes());

        entrada.close();
    }
}
