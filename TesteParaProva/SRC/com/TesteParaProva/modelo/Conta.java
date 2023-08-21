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

    public void depositar(BigDecimal valor){
        System.out.println("Deposito de "+valor+" realizado com sucesso");
        saldoConta=saldoConta.add(valor);
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
