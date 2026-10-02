package exercicio04_smartphone;

public class Smartphone {
    //atributos
    String marca;
    double preco;
    int resolucao;
    boolean estado;

    //comportamentos
    public void ligar() {
        estado = true;
        System.out.println("O celular foi ligado ");
    }

    public void desligar(){
        estado = false;
        System.out.println("O celular desligou ");
    }
    public String informar(){
        return "Marca: " + marca + "Preço: " + preco + "Resolução: " + resolucao;
    }
}
