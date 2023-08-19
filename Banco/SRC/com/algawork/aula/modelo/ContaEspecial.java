package com.algawork.aula.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta{
        private BigDecimal valorLimite;
        
        public ContaEspecial(Pessoa titular, Pessoa documento, int agencia,int numero, BigDecimal valorLimite){
                super(titular,documento,agencia,numero);
                this.valorLimite=valorLimite;
            }
            @Override
            public void debitarTarifaMensal(){
                sacar(new BigDecimal(20));
            }
            
            @Override
            public BigDecimal getSaldoDisponivel(){
                return getSaldo().add(getValorlimite());

            }

            public BigDecimal getValorlimite(){
                return valorLimite;
            }
        
            public void setValorLimite(BigDecimal valorLimite){
                this.valorLimite=valorLimite;
        
            }
            
        


}
