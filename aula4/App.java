package aula4;

import aula4.classes.Pessoa;
import aula4.classes.Conta;

public class App {
    
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bob");
        pessoa.setIdade(20);
        pessoa.setAltura(1.94);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(-200);
        System.out.println(conta.getSaldo());
    }
    
}
