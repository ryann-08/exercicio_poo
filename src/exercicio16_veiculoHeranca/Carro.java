package exercicio16_veiculoHeranca;

public class Carro extends Veiculo{
    private double imposto;

    //metodo get pegar informação do private
    public double getImposto(){
        return imposto;
    }

    //metodo set guardar informação no private
    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double calcularPrecoFinal(){
        return getPrecoBase() + this.imposto;
    }
}
