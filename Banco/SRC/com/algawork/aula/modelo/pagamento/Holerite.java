package com.algawork.aula.modelo.pagamento;
import java.math.BigDecimal;

import com.algawork.aula.modelo.Pessoa;

public class Holerite implements DocumentoPagavel {

    private Pessoa Funcionario;
    private BigDecimal valorHoraTrabalhada;
    private BigDecimal qtdHorasTrabalhada;
    private boolean pago;



    public Holerite(Pessoa funcionario, BigDecimal valorHoraTrabalhada, BigDecimal qtdHorasTrabalhada) {
        Funcionario = funcionario;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.qtdHorasTrabalhada = qtdHorasTrabalhada;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valorHoraTrabalhada.multiply(qtdHorasTrabalhada);
    }

    @Override
    public boolean estaPago() {
      return pago;
    }

    @Override
    public void quitarPagamenmto() {
        pago=true;
    }

    
}
