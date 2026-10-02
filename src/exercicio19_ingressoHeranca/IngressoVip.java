package exercicio19_ingressoHeranca;

public class IngressoVip extends Ingresso{
    //arquivo filho
    @Override
    public double calcularValorFinal(){
        return super.calcularValorFinal() + 80;
    }
}
