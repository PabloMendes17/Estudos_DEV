package com.algawork.aula.modelo.pagamento;

public interface DocumentoExtornavel extends DocumentoPagavel {
    //double getValorTotal(); Estes métodos estão na interface DocumentoPagavel
    //boolean estaPago(); e como precisa estar pago para extornar nos extendemos 
    void estornarPagamneto();//essa interface ao outra


}
