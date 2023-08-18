public class Principal {
    public static void main(String[]args){
       Pessoa titular1 = new Pessoa();
        //titular1.nome="Joao da Silva";Deixando a atribuição direta
        titular1.setNome("Joao da Silva");//Usando o encapsulamento para proteger
       // titular1.documento="12312312311"; 
       titular1.setDocumento("12312312311")

        Pessoa titular2 = new Pessoa();
        titular2.nome="Maria Abaidia";
        titular2.documento="22233344455";

        Conta minhaConta = new Conta();
        minhaConta.titular=titular1;
        minhaConta.doc=titular1;
        minhaConta.agencia=123;
        minhaConta.numero=987;
        minhaConta.saldo=15000;
    
        Conta suaConta = new Conta();
        suaConta.titular=titular2;
        suaConta.doc=titular2;
        suaConta.agencia=222;
        suaConta.numero=333;
        suaConta.saldo=30000;

        Pessoa titular3 = new Pessoa();
        titular3.nome="Tereza Maria";
        titular3.documento="31231231244";

        Conta aquelaConta= new Conta(titular3,titular3,123,852);
        System.out.println("Saldo Inicial: "+aquelaConta.saldo);
        

        System.out.println("Titular: "+minhaConta.titular.nome);
        System.out.println("Documento: "+minhaConta.doc.documento);
        System.out.println("Agencia: "+minhaConta.agencia);
        System.out.println("Numero: "+minhaConta.numero);
        System.out.println("Saldo Inicial: "+minhaConta.saldo);
        System.out.println("Titular: "+suaConta.titular.nome);
        System.out.println("Documento: "+suaConta.doc.documento);
        System.out.println("Agencia: "+suaConta.agencia);
        System.out.println("Numero: "+suaConta.numero);
        System.out.println("Saldo Inicial: "+suaConta.saldo);

        minhaConta.depositar(10);
        suaConta.depositar(30);
        System.out.println("Saldo Atual: "+minhaConta.saldo);
        System.out.println("Saldo Atual: "+suaConta.saldo);
      
        minhaConta.sacar(150, 10);
        System.out.println("Saldo Atual: "+minhaConta.saldo);

        aquelaConta.depositar(150);
        System.out.println("Saldo Atualizado: "+aquelaConta.saldo);


    }
}
