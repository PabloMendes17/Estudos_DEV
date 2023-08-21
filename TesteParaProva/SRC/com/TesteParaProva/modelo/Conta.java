package TesteParaProva.SRC.com.TesteParaProva.modelo;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {
    
    private Pessoa id;
    private int agencia;
    private int nconta;
    private BigDecimal saldoConta= new BigDecimal(0);

    public Conta(Pessoa id, int agencia,int nconta ){
        Objects.nonNull(id);
        this.id=id;
        this.agencia=agencia;
        this.nconta=nconta;

    }
    public Pessoa  getID(){
        return id;
    }
    public int getAgencia(){
        return agencia;
    }
    public int getNconta(){
        return nconta;
    }
    public BigDecimal getSaldoConta(){
        return saldoConta;
    }

    public BigDecimal getSalContaDisponivel(){
        return getSaldoConta();
    }
    
}
