package com.algawork.aula.modelo;

public class ContaEspecial extends Conta{
        private double valorLimite;
        
        public ContaEspecial(Pessoa titular, Pessoa documento, int agencia,int numero, int valorLimite){
                super(titular,documento,agencia,numero);
                this.valorLimite=valorLimite;
            }
            @Override
            public void debitarTarifaMensal(){
                sacar(20);
            }
            
            @Override
            public double getSaldoDisponivel(){
                return getSaldo()+getValorlimite();

            }

            public double getValorlimite(){
                return valorLimite;
            }
        
            public void setValorLimite(double valorLimite){
                this.valorLimite=valorLimite;
        
            }
            
        


}
