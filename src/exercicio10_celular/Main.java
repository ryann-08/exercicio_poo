package exercicio10_celular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Celular meuCelular = new Celular();

        System.out.println("Digite a marca do celular: ");
        meuCelular.marca = entrada.nextLine();

        System.out.println("Digite o modelo do celular: ");
        meuCelular.modelo = entrada.nextLine();

        System.out.println("Didite o armazenamento do ceulular: ");
        meuCelular.armazenamento = entrada.nextInt();

        System.out.println("Digite o valor do celular: ");
        meuCelular.valor = entrada.nextDouble();

        System.out.println(meuCelular.exibirFichaTecnica());

        entrada.close();

    }

}
