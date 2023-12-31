package com.algawork.aula.modelo.pagamento;

import java.math.BigDecimal;

import com.algawork.aula.modelo.Pessoa;

public class Boleto implements DocumentoPagavel, DocumentoExtornavel {

    private Pessoa beneficiario;
    private BigDecimal valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, BigDecimal valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;

    }

    @Override
    public BigDecimal getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamenmto() {
        pago = true;
    }

    @Override
    public void estornarPagamneto() {
        pago=false;
    }

}
