package Exercicio33_curso_ClassesAbstratas;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite o nome do seu curso: ");
        String nomeCursoDigitado = entrada.nextLine();

        System.out.println("Digite a mensalidade desse curso: ");
        double valorMensalidadeCurso = entrada.nextDouble();

        CursoEspecializado meuCurso = new CursoEspecializado(nomeCursoDigitado, valorMensalidadeCurso);

        System.out.println("o seu curso: " + nomeCursoDigitado);
        System.out.println("Teve uma taxa de 5% resultando em: " + meuCurso.calcularPrecoFinal());
    }


}
