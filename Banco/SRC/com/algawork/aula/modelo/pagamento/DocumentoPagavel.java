package com.algawork.aula.modelo.pagamento;

public interface DocumentoPagavel {
   
        double getValorTotal();
        boolean estaPago();
        void quitarPagamenmto();

    
    
}
