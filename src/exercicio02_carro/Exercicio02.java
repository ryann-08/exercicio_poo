package exercicio02_carro;

public class Exercicio02 {
    static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1975;
        meuCarro.cor= "azul";

        System.out.println("Modelo do carro é " + meuCarro.modelo);
        System.out.println("ano do carro é " + meuCarro.ano);
        System.out.println("a cor é " + meuCarro.cor);
    }


}
