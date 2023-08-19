package com.algawork.aula.modelo.atm;

import com.algawork.aula.modelo.Conta;
import com.algawork.aula.modelo.pagamento.DocumentoExtornavel;
import com.algawork.aula.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
  /* public void imprimirSaldo(ContaInvestimento conta) nessa classe e nesse método teria q
     identificar obejto fixamente na chamada deste para a classe de cada um para que isso não
     ocorra podemos usar o polimorfismo onde usamos a classe superior para apontar para a especifica*/
   public void imprimirSaldo(Conta conta){
    System.out.println("Conta: "+conta.getAgencia()+"/"+conta.getNumero());
    System.out.println("Titular: "+conta.getTitular().getNome());
    System.out.println("Saldo Atual: "+conta.getSaldo()); 
    System.out.println("Saldo Disponível: "+conta.getSaldoDisponivel());
   } 

   public void pagar(DocumentoPagavel documento, Conta conta){
    if(documento.estaPago()){
        throw new IllegalStateException("Documento já pago");
      }
      conta.sacar(documento.getValorTotal());
      documento.quitarPagamenmto();
    }

    public void estornarPagamneto(DocumentoExtornavel documento, Conta conta){
        if(!documento.estaPago()){
          throw new IllegalStateException("Documento não esta pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamneto();
        
    }


}
