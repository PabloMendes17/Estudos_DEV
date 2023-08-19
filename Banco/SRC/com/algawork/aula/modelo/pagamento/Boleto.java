package com.algawork.aula.modelo.pagamento;

import com.algawork.aula.modelo.Pessoa;

public class Boleto implements DocumentoPagavel, DocumentoExtornavel {

    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;

    }

    @Override
    public double getValorTotal() {
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
