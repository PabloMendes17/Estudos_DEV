package TesteParaProva.SRC.com.TesteParaProva.modelo;

public class Cartao {

    private int ncartao;
    private Conta agencia;
    private Conta nconta;

    public Cartao(int ncartao, Conta agencia, Conta nconta){
        this.ncartao=ncartao;
        this.agencia=agencia;
        this.nconta=nconta;
        
    }

    public int ncartao(){
        return ncartao;
    }
    
}
