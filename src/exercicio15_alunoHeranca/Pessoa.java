package exercicio15_alunoHeranca;

public class Pessoa {
    //arquivo pai

    //atributos
    private String nome;
    private double nota;

    //metodo get pega informação do private
    public String getNome(){
        return nome;
    }
    public double getNota(){
        return nota;
    }

    //metodo set guarda um valor no private
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
}
