package exercicio04_smartphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //1 criamos a ferramenta para ler dados do teclado
        Scanner entrada = new Scanner(System.in);

        //2 Criamos um smartphone real usando o nosso molde de smartphone
        Smartphone celular = new Smartphone();

        //3 perguntando para o usuario e guardando no celular
        System.out.println("Digite a marca do celular: ");
        celular.marca = entrada.nextLine();

        System.out.println("Digite o preco de celular: ");
        celular.preco = entrada.nextDouble();

        System.out.println("Digite a resolução do celular: ");
        celular.resolucao = entrada.nextInt();

        // 4. Testando os botões/funções do celular
        System.out.println("\n--- Testando o Smartphone ---");
        celular.ligar();
        System.out.println(celular.informar());
        celular.desligar();

        // 5. Desligando o "microfone"
        entrada.close();
    }
}
