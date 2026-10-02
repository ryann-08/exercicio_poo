package exercicio03_filme;

public class Exercicio03 {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.titulo = ("Batman");
        meuFilme.genero = ("Ação");
        meuFilme.duracaoMinutos = 175;

        System.out.println("O exercicio03_filme.Filme " +meuFilme.titulo+ " é "
                +meuFilme.genero+ " de " +meuFilme.duracaoMinutos+ " minutos");
    }
}
