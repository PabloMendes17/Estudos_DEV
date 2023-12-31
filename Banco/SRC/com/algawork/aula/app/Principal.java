package com.algawork.aula.app;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.algawork.aula.modelo.Conta;
import com.algawork.aula.modelo.ContaSimples;
import com.algawork.aula.modelo.ContaEspecial;
import com.algawork.aula.modelo.Pessoa;
import com.algawork.aula.modelo.atm.CaixaEletronico;
import com.algawork.aula.modelo.ContaInvestimento;
import com.algawork.aula.modelo.pagamento.Boleto;
import com.algawork.aula.modelo.pagamento.DocumentoPagavel;
import com.algawork.aula.modelo.pagamento.Holerite;

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
        //Conta minhaConta= new Conta(titular1,titular1,123,987); Agora que a conta é abstrata 
        //não podemos usar esse tipo de instanciação
        ContaSimples minhaConta= new ContaSimples(titular1,titular1,123,987);
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
        ContaSimples suaConta= new ContaSimples(titular2,titular2,222,333);

        Pessoa titular3 = new Pessoa();
        titular3.setNome("Tereza Maria");
        titular3.setDocumento("31231231244");

        //Conta aquelaConta= new Conta(titular3,titular3,123,852); agora que a classe é abstrata esta instaciação 
        //para de funcionar 
         ContaSimples aquelaConta= new ContaSimples(titular3,titular3,123,852);  
        System.out.println("Saldo Inicial: "+aquelaConta.getSaldo());

        ContaInvestimento minhaContaInvestimento= new ContaInvestimento(titular1,titular1,123,777);

        ContaEspecial minhaContaEspecial = new ContaEspecial(titular1,titular1,123,666,new BigDecimal(1000));
        
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

        minhaConta.depositar( new BigDecimal(20));
        suaConta.depositar(new BigDecimal(30));
        System.out.println("Saldo Atual: "+minhaConta.getSaldo());
        System.out.println("Saldo Atual: "+suaConta.getSaldo());
      
        minhaConta.sacar(new BigDecimal(5), new BigDecimal(0.1));
        System.out.println("Saldo Atual: "+minhaConta.getSaldo());

        aquelaConta.depositar(new BigDecimal(150));
        System.out.println("Saldo Atualizado: "+aquelaConta.getSaldo());

        minhaContaInvestimento.depositar(new BigDecimal(10));
        minhaContaInvestimento.creditarRendimento(new BigDecimal(0.3));
        System.out.println("Saldo Atual: "+minhaContaInvestimento.getSaldo());

        minhaContaEspecial.depositar(new BigDecimal(1500));
        System.out.println("Saldo Atual: "+minhaContaEspecial.getSaldo());
        System.out.println("Saldo + Limite: "+minhaContaEspecial.getSaldoDisponivel());
        // minhaContaEspecial.sacar(2501); se tentar sacar mais que o Saldo e limite informa sem saldo
        minhaContaEspecial.sacar(new BigDecimal(2000));// como o saque é maior que o Saldo mas menos que saldo menos limite
        System.out.println("Saldo Atual: "+minhaContaEspecial.getSaldo());//o saque pe realizado e o valor de 
        //saldo é atualizado e fica negativo
        
        CaixaEletronico cxEletronico = new CaixaEletronico();//Com o polimorfismo aplicado na classe
        cxEletronico.imprimirSaldo(minhaContaInvestimento);//Caixa Eletronico, não pe necessario criar 
                                                           //Mais de um método para atender os tipos       
        cxEletronico.imprimirSaldo(minhaContaEspecial);    //diferentes de conta, mas um único método
                                                           //Enxergado diferente para cada chamada
        minhaContaEspecial.debitarTarifaMensal();
        cxEletronico.imprimirSaldo(minhaContaEspecial);

        Boleto boletoEscola = new Boleto(titular3,new BigDecimal(200));
        System.out.println("Boleto pago: "+boletoEscola.estaPago());
        cxEletronico.pagar(boletoEscola, minhaContaEspecial);
        System.out.println("Boleto pago: "+boletoEscola.estaPago());
        cxEletronico.imprimirSaldo(minhaContaEspecial);
        minhaContaEspecial.depositar(new BigDecimal(10000));
        cxEletronico.imprimirSaldo(minhaContaEspecial);
        Pessoa titular4 = new Pessoa();
        titular4.setNome("Pablo Mendes");
        titular4.setDocumento("9424");
        Holerite holeritePablo = new Holerite(titular4,new BigDecimal(50),new BigDecimal(40));
        cxEletronico.pagar(holeritePablo, minhaContaEspecial);
        holeritePablo.imprimirRecibo();
        cxEletronico.imprimirSaldo(minhaContaEspecial);
        cxEletronico.estornarPagamneto(boletoEscola, minhaContaEspecial);
        cxEletronico.imprimirSaldo(minhaContaEspecial);
        
      /*minhaContaEspecial.sacar(9000);quando a chamada é feita 
        desta forma mesmo que tenha dido realizado um tratamento de 
        erro desntro do método como existe uma pilha de chamada até 
        ele tambem é retornado uma trilha pela qual a chama retornou 
        alem de que desta forma o programa para a execução e dependendo
        de onde for a chamada o programa deixara de executar outras
        chamadas validas*/
        try {
            minhaContaEspecial.sacar(new BigDecimal(9000));

        }catch(IllegalStateException e){
            System.out.println("Erro de execução "+e.getMessage());
        }
        System.out.println(titular1.getdataUltimaAtualizacao());
        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2023-08-18T18:00"));
        System.out.println(titular1.getdataUltimaAtualizacao());


    }
}
