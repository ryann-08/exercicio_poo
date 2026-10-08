package Exercicio33_curso_ClassesAbstratas;

public class CursoEspecializado extends Curso{

    //contrutor (CursoEspecializado) recebe da classe pai ambos com this
    public CursoEspecializado(String nomeCurso, double valorMensalidade){
        this.nomeCurso = nomeCurso;
        this.valorMensalidade = valorMensalidade;

    }

    // override é sobreescrita, vamos pegar o metodo, e dar o valo de negocio para ele
    @Override
    public double calcularPrecoFinal(){
        return valorMensalidade * 1.05;
    }
    //acabei de adicionar uma taxa fixa de 5%
}
