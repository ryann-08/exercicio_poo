package exercicio17_funcionarioHeranca;

public class Gerente extends Funcionario{
    private double bonus;

    //metodo get pegar informação no private
    public double getBonus(){
        return this.bonus;
    }

    //metodo set guardar informação no private
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    //metodo de ação
    public double calcularSalarioTotal(){
        return getSalarioBase() + bonus;
    }

}
