package exercicio12_conta;

public class ContaBancaria {
    //atributos
    String titular;
    double saldo;

    //metodo1  apenas lê os dados e devolve um texto (sem parametro)
    public String exibirSaldo(){
        return "O "+ titular + " tem: " +saldo+ " de saldo na conta. ";
    }
    //metodo 2 recebe um valor e altera o saldo (usa void pois nao devolve nada, só altera)
    public void depositar(double valor){
        //o '+=' soma o valor recebido no pârametro direto na variavel 'saldo' da classe
        saldo += valor;
    }
    //metodo3 (dois parametros)
    public double calcularEmprestimo(double valorSolicitado, double taxaPercentual){
        //calcula quanto vale a taxa sobre o valor pedido
        double valorJuros = valorSolicitado * (taxaPercentual / 100);
        //devolve o valor final que a pessoa vai pagar no final
        return valorSolicitado + valorJuros;
    }
}
