public class ContaInvestimento extends Conta{  
/*Esta é a herança ira herdar tudo de Conta
 Porem pode implementar novos métodos somente 
 dela*/ 
 //Começamos pelo construtor
    public ContaInvestimento(Pessoa titular, Pessoa documento, int agencia,int numero){
        super(titular,doc,agencia,numero);//aqui invocamos o construtor da classe Conta
        //Não o construtor padrão mas o customizado, se deixarmos vazio chamara o vazio
    }

    public void creditarRendimento(double percentualJuros){
        double valorRendimentos= getSaldo()*percentualJuros/100;
        depositar(valorRendimentos);
    }
    
}