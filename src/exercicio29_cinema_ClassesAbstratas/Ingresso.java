package exercicio29_cinema_ClassesAbstratas;

//abstract: define que a classe é apenas um modelo (molde) e naoi pode ser instanciada com "new"
public abstract class Ingresso {

    //atributos herdados por todasas classes filhas de ingresso
    String nomeFilme;
    double precoBase;

    //metodo abstrato funciona como um contrato obrigatorio
    //nao tem corpo ({}) nem logica aqui, forca as classes filhas implementa-lo
    public abstract double calcularPreco();
}
