package exercicio18_bonificacaoHeranca;

public class Gerente extends Funcionario{
    //class/arquivo filho
    @Override
    public double calcularBonificacao(){
        return (getSalario() * 0.20) + 500;
    }


}
