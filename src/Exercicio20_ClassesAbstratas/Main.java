package Exercicio20_ClassesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lista do tipo da Interface
        List<Ligavel> listaDeAparelhos = new ArrayList<>();

        // Adiciona a TV na lista
        Televisao minhaTv = new Televisao("Samsung");
        listaDeAparelhos.add(minhaTv);

        // Percorre a lista e roda o método ligar()
        for (Ligavel item : listaDeAparelhos) {
            item.ligar();
        }
    }
}