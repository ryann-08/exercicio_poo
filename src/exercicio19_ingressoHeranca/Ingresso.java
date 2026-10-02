package exercicio19_ingressoHeranca;

public class Ingresso {
    //arquivo pai
    private double valor;

    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double calcularValorFinal(){
        return getValor();
    }

}
