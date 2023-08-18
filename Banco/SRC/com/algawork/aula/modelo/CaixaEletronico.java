package com.algawork.aula.modelo;

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
}
