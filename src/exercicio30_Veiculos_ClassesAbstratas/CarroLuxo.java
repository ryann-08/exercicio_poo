package exercicio30_Veiculos_ClassesAbstratas;

public class CarroLuxo extends Veiculo{

    public CarroLuxo(String modelo, double valorDiarioBase){
        this.modelo = modelo;
        this.valorDiarioBase = valorDiarioBase;
    }

    @Override
    public double calcularAluguelDiario(int dias){
        return (valorDiarioBase * dias) + 100.0;
    }
}
