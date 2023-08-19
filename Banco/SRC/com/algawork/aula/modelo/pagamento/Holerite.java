package com.algawork.aula.modelo.pagamento;
import com.algawork.aula.modelo.Pessoa;

public class Holerite implements DocumentoPagavel {

    private Pessoa Funcionario;
    private double valorHoraTrabalhada;
    private double qtdHorasTrabalhada;
    private boolean pago;



    public Holerite(Pessoa funcionario, double valorHoraTrabalhada, double qtdHorasTrabalhada) {
        Funcionario = funcionario;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.qtdHorasTrabalhada = qtdHorasTrabalhada;
    }

    @Override
    public double getValorTotal() {
        return valorHoraTrabalhada*qtdHorasTrabalhada;
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
