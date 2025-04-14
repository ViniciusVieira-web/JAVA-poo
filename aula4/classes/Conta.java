package aula4.classes;

public class Conta {
    
    public double saldo;

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor de deposito inválido");
        }
        saldo = saldo + valor;
    }

    public double getSaldo(){  
        return saldo;
    }
}
    
    
