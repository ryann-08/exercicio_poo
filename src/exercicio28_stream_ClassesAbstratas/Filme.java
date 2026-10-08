package exercicio28_stream_ClassesAbstratas;

public class Filme extends Conteudo{

    public Filme(String titulo, double notaBase){
        this.titulo = titulo;
        this.notaBase = notaBase;
    }

    @Override
    public double calcularRecomendacao(){
        return notaBase * 1.1;
    }
}
