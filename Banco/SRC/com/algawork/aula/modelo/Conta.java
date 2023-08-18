package com.algawork.aula.modelo;
import java.util.Objects;
public class Conta{
    private Pessoa titular;//modificador de acesso para proteger 
    private Pessoa doc;
    private int agencia;
    private int numero;
    private double saldo;
    
/*Construtor, para substituir toda a implementação
Realizada no método main*/
    public Conta(Pessoa titular, Pessoa doc, int agencia, int numero){
        Objects.requireNonNull(titular);
        this.titular=titular;
        this.doc=doc;
        this.agencia=agencia;
        this.numero=numero;

    }

    Conta(){}/*Quando criamos um construtor próprio o 
    O construtor do JAVA para de funcionar assim podemor
    recrialo com sobrecarga de construtores para funcionar
    os dois construtores*/

    public void depositar(double valor){//Métodos 
        if(valor>=0){
            saldo+=valor;
        }else{
            throw new IllegalStateException("Valor Inválido deve ser superior a 0");
        }
       
    }

    public void sacar(double valor){
        if(valor<=0){
             throw new IllegalStateException("Valor Inválido deve ser superior a 0");
        }else if(getSaldoDisponivel()-valor>=0){
            saldo-=valor;
        }else{
            throw new IllegalStateException("Saldo Insuficiente"); 
        }

    }

    public void sacar(double valor,double txSaque){//Sobre Carga de métodos
        sacar(valor+txSaque);

    }

    public Pessoa getTitular(){
        return titular;

    }

    public Pessoa getDoc(){
        return doc;

    }
    public void setDoc(Pessoa doc){
        this.doc=doc;
    }
    public int getAgencia(){
        return agencia;

    }

    public int getNumero(){
        return numero;

    }

    public double getSaldo(){
        return saldo;

    }

    public double getSaldoDisponivel(){//Para usar a sobre escrita de metodos 
        return getSaldo();             //Criamos uma novo método que chamará 
    }                                  //O método utilizado e na classe filha
                                       //Escrevermos o método necessário 
}