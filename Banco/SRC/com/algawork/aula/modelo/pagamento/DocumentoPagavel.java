package com.algawork.aula.modelo.pagamento;

import java.math.BigDecimal;

public interface DocumentoPagavel {
   
        BigDecimal getValorTotal();
        boolean estaPago();
        void quitarPagamenmto();
        default void imprimirRecibo(){
            System.out.println("RECIBO");
            System.out.println("Valor Pago: "+getValorTotal() );
            System.out.println("Pago: "+estaPago());

        }

    
    
}
