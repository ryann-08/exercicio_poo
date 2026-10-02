package Exercicio20_ClassesAbstratas;

// 'abstract' impede o 'new Dispositivo()' direto.
// 'implements Ligavel' assina o contrato da interface.
public abstract class Dispositivo implements Ligavel {

    private String marca;

    // Construtor do pai
    public Dispositivo(String marca) {
        this.marca = marca;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
