package Exercicio20_ClassesAbstratas;

// 'extends Dispositivo' herda tudo da classe pai.
public class Televisao extends Dispositivo {

    // Construtor repassa a marca para o pai via super()
    public Televisao(String marca) {
        super(marca);
    }

    // Escreve o código real exigido pela interface/pai
    @Override
    public void ligar() {
        System.out.println("A TV da marca " + getMarca() + " está ligando a tela...");
    }
}