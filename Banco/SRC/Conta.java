import java.util.Objects;
public class Conta{
    private Pessoa titular;//modificador de acesso para proteger 
    private Pessoa doc;
    private int agencia;
    private int numero;
    private double saldo;
    
/*Construtor, para substituir toda a implementação
Realizada no método main*/
    Conta(Pessoa titular, Pessoa doc, int agencia, int numero){
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

    void depositar(double valor){//Métodos 
        if(valor>=0){
            saldo+=valor;
        }else{
            throw new IllegalStateException("Valor Inválido deve ser superior a 0");
        }
       
    }

    void sacar(double valor){
        if(valor<=0){
             throw new IllegalStateException("Valor Inválido deve ser superior a 0");
        }else if(saldo-valor>=0){
            saldo-=valor;
        }else{
            throw new IllegalStateException("Saldo Insuficiente"); 
        }

    }

    void sacar(double valor,double txSaque){//Sobre Carga de métodos
        sacar(valor+txSaque);

    }

    public void getTitular(){
        return titular;

    }
    public vois setTitular(Pessoa titular){
        this.titular=titular;
    }
    public void getDoc(){
        return doc;

    }
    public vois setDoc(Pessoa doc){
        this.doc=doc;
    }
    public void getAgencia(){
        return agencia;

    }
    public vois setAgencia(int agencia){
        this.agencia=agencia;
    }
    public void getNumero(){
        return numero;

    }
    public vois setNumero(int numero){
        this.numero=numero;
    }
    public void getSaldo(){
        return saldo;

    }
    public vois setSaldo(int saldo){
        this.saldo=saldo;
    }
}