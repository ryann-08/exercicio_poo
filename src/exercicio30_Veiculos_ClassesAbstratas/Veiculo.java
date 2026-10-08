package exercicio30_Veiculos_ClassesAbstratas;

public abstract class Veiculo {
    String modelo;
    double valorDiarioBase;



    public abstract double calcularAluguelDiario(int dias);
}