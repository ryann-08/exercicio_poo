package exercicio16_veiculoHeranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Carro meuCarro = new Carro();

        System.out.println("Digite a marca: ");
        meuCarro.setMarca(entrada.nextLine());

        System.out.println("Digite o valor base: ");
        meuCarro.setPrecoBase(entrada.nextDouble());

        System.out.println("Digite o valor do imposto: ");
        meuCarro.setImposto(entrada.nextDouble());

        System.out.println("A marca é : " + meuCarro.getMarca());
        System.out.println("E o valor total a pagar é: " + meuCarro.calcularPrecoFinal());

        entrada.close();

    }
}
