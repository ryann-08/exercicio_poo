package exercicio15_alunoHeranca;

public class Aluno extends Pessoa {
    private double nota2;

    //metodo get pegar informação no private
    public double getNota2(){
        return nota2;
    }
    //metodo set guardar informação no private
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (getNota() + this.nota2) / 2;
    }
}
