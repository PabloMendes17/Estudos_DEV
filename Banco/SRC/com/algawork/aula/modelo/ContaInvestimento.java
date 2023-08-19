package com.algawork.aula.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimento extends Conta{  
/*Esta é a herança ira herdar tudo de Conta
 Porem pode implementar novos métodos somente 
 dela*/ 

 //Começamos pelo construtor
    public ContaInvestimento(Pessoa titular, Pessoa documento, int agencia,int numero){
        super(titular,documento,agencia,numero);//aqui invocamos o construtor da classe Conta
        //Não o construtor padrão mas o customizado, se deixarmos vazio chamara o vazio
    }

    public void creditarRendimento(BigDecimal percentualJuros){
        BigDecimal valorRendimentos= getSaldo().multiply(percentualJuros).divide(new BigDecimal(100),2,RoundingMode.HALF_EVEN);
        depositar(valorRendimentos);
    }

    public void debitarTarifaMensal(){
        if(getSaldo().compareTo(BigDecimal.ZERO)<10000){
            sacar(new BigDecimal(30));
        }
    }

    
    
}