package exercicio16_veiculoHeranca;

public class Veiculo {
    //classe pai
    private String marca;
    private double precoBase;

    //metodo get pega informacao no private
    public String getMarca(){
        return marca;
    }
    public double getPrecoBase(){
        return precoBase;
    }

    //metodo set guardar um valor no private
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }
}
