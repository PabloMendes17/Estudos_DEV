public class Principal {
    public static void main(String[]args){
        Conta minhaConta = new Conta();
        minhaConta.nomeTitular="Joao da Silva";
        minhaConta.agencia=123;
        minhaConta.numero=987;
        minhaConta.saldo=15000;

        Conta suaConta = new Conta();
        suaConta.nomeTitular="Maria Abaidia";
        suaConta.agencia=222;
        suaConta.numero=333;
        suaConta.saldo=30000;


        System.out.println("Titular: "+minhaConta.nomeTitular);
        System.out.println("Agencia: "+minhaConta.agencia);
        System.out.println("Titular: "+suaConta.nomeTitular);
        System.out.println("Agencia: "+suaConta.agencia);


    }
}
