package exercicio17_funcionarioHeranca;

public class Funcionario {
    //arquivo pai
    private String nome;
    private double salarioBase;

    //metodo get pegar informacao do private
    public String getNome(){
        return this.nome = nome;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }

    //metodo set guardar uma informação no private
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    }