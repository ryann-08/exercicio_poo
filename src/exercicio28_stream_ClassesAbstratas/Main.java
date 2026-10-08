package exercicio28_stream_ClassesAbstratas;

public class Main {
    public static void main(String[] args){
        Filme meuFilme = new Filme("matrix", 4.0);

        double recomendacao = meuFilme.calcularRecomendacao();

        System.out.println("filme " + meuFilme.titulo);
        System.out.println("nota base " + meuFilme.notaBase);
        System.out.println("nota recomendacao (10%)" + recomendacao );
    }
}
