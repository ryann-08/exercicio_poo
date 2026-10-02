package Exercicio20_ClassesAbstratas;

// Usamos 'interface' no lugar de 'class' porque ela é apenas um contrato de regras.
public interface Ligavel {

    // Declaração do método exigido pela interface.
    // 'public' permite que qualquer outra classe veja esse método.
    // 'void' significa que ele executa uma ação, mas não retorna nenhum valor.
    // Termina com ponto e vírgula (;) porque a interface não tem o código com chaves {}.

    public void ligar();

}