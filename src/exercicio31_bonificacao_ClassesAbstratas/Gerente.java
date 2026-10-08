package exercicio31_bonificacao_ClassesAbstratas;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularBonificacao(){
        return salarioBase * 2.0;
    }
}
