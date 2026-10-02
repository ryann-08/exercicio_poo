package exercicio13_desconto;

public class Produto {
    //atributos
    String nome;
    double preco;
    double desconto;

    //metodo 1 sem parametros
    public String exibirDados(){
        return  nome + " com o valor de: " +preco+ " R$ ";
    }

    //metodo 2 com 1 parametro
    public void aplicarDesconto(double valorDesconto){
         preco -= valorDesconto;
         desconto = valorDesconto; //faltava isso aqui atribuir o valorDesconto na variavel desconto
    }

    //metodo 3 eu que inventei - quero que apareca o valor de desconto na tela
    public String exibirDadosAtualizado() {
        return nome + " com o valor novo de: " + preco + " R$ \nO valor de desconto foi: " + desconto;
    }
}
