package exercicio32_desconto_ClassesAbstratas;

public class PratoPromocional extends Prato {

    public PratoPromocional(String nomePrato, double precOriginal){
        this.nomePrato = nomePrato;
        this.precOriginal = precOriginal;
    }


    @Override
    public double calcularPrecoComDesconto(){
        return precOriginal * 0.85;
    }
}
