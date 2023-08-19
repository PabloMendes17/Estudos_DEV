package com.algawork.aula.modelo.pagamento;

public interface DocumentoPagavel {
   
        double getValorTotal();
        boolean estaPago();
        void quitarPagamenmto();
        default void imprimirRecibo(){
            System.out.println("RECIBO");
            System.out.println("Valor Pago: "+getValorTotal() );
            System.out.println("Pago: "+estaPago());

        }

    
    
}
