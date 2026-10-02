package exercicio10_celular;

public class Celular {
    //atributos
    String marca;
    String modelo;
    int armazenamento;
    double valor;

    //metodo
    public String exibirFichaTecnica(){
        return "Marca: " + marca + "\nModelo: " + modelo +
                "\nArmazenamento: " +armazenamento + "\nvalor é: " + valor;
    }
}
