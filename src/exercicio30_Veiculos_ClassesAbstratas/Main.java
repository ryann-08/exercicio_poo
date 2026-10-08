package exercicio30_Veiculos_ClassesAbstratas;

public class Main {
    static void main(String[] args) {

        CarroLuxo meuCarro = new CarroLuxo("porsche", 100.0);

        System.out.println("modelo: " + meuCarro.modelo);
        System.out.println("valor total (3 dias) R$ " + meuCarro.calcularAluguelDiario(3));
    }
}
