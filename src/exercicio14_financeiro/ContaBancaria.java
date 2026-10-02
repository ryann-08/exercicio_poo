package exercicio14_financeiro;

public class ContaBancaria {
    String titular;
    double saldo;

    //metodo
    public void sacar(double valor){
        if (valor <= 0 ){
            System.out.println("ERRO - saldo invalido");
        }
        else if (valor > saldo){
            System.out.println("ERRO - valor maior que saldo -  seu saldo é " + saldo);
        }
        else  {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso novo saldo de R$ " + saldo);
        }

    }
}
