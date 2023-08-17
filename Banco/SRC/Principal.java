public class Principal {
    public static void main(String[]args){
        Pessoa titular1 = new Pessoa();
        titular1.nome="Joao da Silva";
        titular1.documento="12312312311";

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


        System.out.println("Titular: "+minhaConta.titular.nome);
        System.out.println("Agencia: "+minhaConta.agencia);
        System.out.println("Documento: "+minhaConta.doc.documento);
        System.out.println("Titular: "+suaConta.titular.nome);
        System.out.println("Agencia: "+suaConta.agencia);
        System.out.println("Documento: "+suaConta.doc.documento);


    }
}
