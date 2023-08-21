package TesteParaProva.SRC.com.TesteParaProva.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta{

    private BigDecimal chequeEspecial=new BigDecimal(0);
    
    public ContaEspecial(Pessoa id, int agencia,int nconta, BigDecimal chequeEspecial){
        super(id,agencia,nconta);
        this.chequeEspecial=chequeEspecial;

    }

    public BigDecimal getChequeEspecial(){
        return chequeEspecial;
    }

    public void setChequeEspecial(BigDecimal chequeEspecial){
        this.chequeEspecial= chequeEspecial;
    }
    
    @Override
    public BigDecimal getSalContaDisponivel(){
        return getSaldoConta().add(getChequeEspecial());
    }
}
