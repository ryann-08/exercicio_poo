package exercicio29_cinema_ClassesAbstratas;

public class IngressoVIP extends Ingresso {

    // Construtor: Executado ao criar um objeto 'new IngressoVIP(...)'.
    // Recebe o nome do filme e o preço base como parâmetros temporários.
    public IngressoVIP(String nomeFilme, double precoBase){

       // this: Associa os valores recebidos nos parâmetros aos atributos oficiais do objeto
        this.nomeFilme = nomeFilme;
        this.precoBase = precoBase;
    }

    // @Override: Sinaliza que estamos a sobrescrever o método abstrato herdado da classe pai.
    @Override
    public double calcularPreco(){
        return precoBase * 1.5;
    }

}
