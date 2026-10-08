package exercicio29_cinema_ClassesAbstratas;

public class Main {
    static void main(String[] args) {

        //Instancia o objeto ingressoVip passando o titulo do filme e o preco base
        IngressoVIP meuIngresso = new IngressoVIP("Vingadores", 30.0);

        System.out.println("Filme: " + meuIngresso.nomeFilme);
        System.out.println("valor: " + meuIngresso.precoBase);
        System.out.println("valor final: " + meuIngresso.calcularPreco());
    }
}
