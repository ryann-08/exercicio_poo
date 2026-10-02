package exercicio18_bonificacaoHeranca;

public class Funcionario {
    //arquivo pai
    private String nome;
    private double salario;

    //metodo get pegar informação do private
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }

    //metodo set guardar informação no private
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    //metodo de conta
    public double calcularBonificacao(){
        return getSalario() * 0.10;
    }
}
