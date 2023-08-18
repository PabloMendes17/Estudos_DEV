import com.algawork.aula.modelo.Conta;
import com.algawork.aula.modelo.Pessoa;

package com.algawork.aula.app;
public class Principal {
    public static void main(String[]args){
       Pessoa titular1 = new Pessoa();
        //titular1.nome="Joao da Silva";Deixando a atribuição direta
        titular1.setNome("Joao da Silva");//Usando o encapsulamento para proteger
       // titular1.documento="12312312311"; 
       titular1.setDocumento("12312312311");

        Pessoa titular2 = new Pessoa();
        //titular2.nome="Maria Abaidia";
        titular2.setNome("Maria Abaidia");
        //titular2.documento="22233344455";
        titular2.setDocumento("22233344455");

        //Conta minhaConta = new Conta();//
        Conta minhaConta= new Conta(titular1,titular1,123,987);
        //minhaConta.titular=titular1;
        //minhaConta.setTitular(titular2);por segurança esse método foi excluido
        //minhaConta.doc=titular1;        para não ser possível atribuir novos valore
        //minhaConta.setDoc(titular2);    para esta conta o valor será atribuido na criação do
        //minhaConta.agencia=123;         objeto  
        //minhaConta.setAgencia(123);
        //minhaConta.numero=987;
        //minhaConta.setNumero(987);
        //minhaConta.saldo=15000;
        //minhaConta.setSaldo(1500);Para não permitir que o saldo seja atualizado diretamente
        //vamos remover o serSaldo da

        /*Conta suaConta = new Conta();
        suaConta.setTitular(titular2);
        suaConta.setDoc(titular2);
        suaConta.setAgencia(222);
        suaConta.setNumero(333);Usando o construtor informamos os dados na 
        suaConta.setSaldo(30000);criação do objeto dos atributos que não tem SET*/
        Conta suaConta= new Conta(titular2,titular2,222,333);

        Pessoa titular3 = new Pessoa();
        titular3.setNome("Tereza Maria");
        titular3.setDocumento("31231231244");

        Conta aquelaConta= new Conta(titular3,titular3,123,852);
        System.out.println("Saldo Inicial: "+aquelaConta.getSaldo());
        
        //System.out.println("Titular: "+minhaConta.titular.nome);// não é mais acessado diretamente e sim por método
        System.out.println("Titular: "+minhaConta.getTitular().getNome());
        System.out.println("Documento: "+minhaConta.getDoc().getDocumento());
        System.out.println("Agencia: "+minhaConta.getAgencia());
        System.out.println("Numero: "+minhaConta.getNumero());
        System.out.println("Saldo Inicial: "+minhaConta.getSaldo());
        System.out.println("Titular: "+suaConta.getTitular().getNome());
        System.out.println("Documento: "+suaConta.getDoc().getDocumento());
        System.out.println("Agencia: "+suaConta.getAgencia());
        System.out.println("Numero: "+suaConta.getNumero());
        System.out.println("Saldo Inicial: "+suaConta.getSaldo());

        minhaConta.depositar(10);
        suaConta.depositar(30);
        System.out.println("Saldo Atual: "+minhaConta.getSaldo());
        System.out.println("Saldo Atual: "+suaConta.getSaldo());
      
        minhaConta.sacar(150, 10);
        System.out.println("Saldo Atual: "+minhaConta.getSaldo());

        aquelaConta.depositar(150);
        System.out.println("Saldo Atualizado: "+aquelaConta.getSaldo());


    }
}
