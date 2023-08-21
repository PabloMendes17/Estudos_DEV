package TesteParaProva.SRC.com.TesteParaProva.app;

import java.math.BigDecimal;

import TesteParaProva.SRC.com.TesteParaProva.modelo.ContaBasica;
import TesteParaProva.SRC.com.TesteParaProva.modelo.ContaEspecial;
import TesteParaProva.SRC.com.TesteParaProva.modelo.PessoaFisica;
import TesteParaProva.SRC.com.TesteParaProva.modelo.PessoaJuridica;

public class Principal {
    public static void main(String[]args){
        PessoaFisica pFisica1=new PessoaFisica(1,"Pablo Mendes","01882847105", "61998233944","Qr 310 CJ 5A" , "03", "Samambaia Sul", "Brasilia", "DF", "72015605", "firefoxpablo@gmail.com");
        PessoaJuridica pJuridica1=new PessoaJuridica(2, "FLAG SISTEMAS", "22333444000155", "35501699", "SIA Trecho 3", "S/N", "Guará", "null", "DF", "71100000", "suporte@flagsistemas.com.br");
        
        System.out.println(pFisica1.getRazaoSocial());
        System.out.println(pJuridica1.getRazaoSocial());

        ContaBasica cpFisica1=new ContaBasica(pFisica1, 156, 352400);
        ContaEspecial cpJuridica1 = new ContaEspecial(pJuridica1,156,352401,new BigDecimal(10000));

        System.out.println("Titular: "+pFisica1.getRazaoSocial());
        System.out.println("Documento: "+pFisica1.getCPF());
        System.out.println("Agencia: "+cpFisica1.getAgencia());
        System.out.println("Numero da conta: "+cpFisica1.getNconta());  
        System.out.println("Saldo: "+cpFisica1.getSaldoConta());
        System.out.println("Saldo + Cheque Especial: "+cpFisica1.getSalContaDisponivel());

        cpFisica1.depositar(new BigDecimal(130));

        System.out.println("Titular: "+pFisica1.getRazaoSocial());
        System.out.println("Documento: "+pFisica1.getCPF());
        System.out.println("Agencia: "+cpFisica1.getAgencia());
        System.out.println("Numero da conta: "+cpFisica1.getNconta());  
        System.out.println("Saldo: "+cpFisica1.getSaldoConta());
        System.out.println("Saldo + Cheque Especial: "+cpFisica1.getSalContaDisponivel());

        System.out.println("Titular: "+pJuridica1.getRazaoSocial());
        System.out.println("Documento: "+pJuridica1.getCNPJ());
        System.out.println("Agencia: "+cpJuridica1.getAgencia());
        System.out.println("Numero da conta: "+cpJuridica1.getNconta());  
        System.out.println("Saldo: "+cpJuridica1.getSaldoConta());
        System.out.println("Saldo + Cheque Especial: "+cpJuridica1.getSalContaDisponivel());

        cpJuridica1.depositar(new BigDecimal(10500));

        System.out.println("Titular: "+pFisica1.getRazaoSocial());
        System.out.println("Documento: "+pFisica1.getCPF());
        System.out.println("Agencia: "+cpFisica1.getAgencia());
        System.out.println("Numero da conta: "+cpFisica1.getNconta());  
        System.out.println("Saldo: "+cpFisica1.getSaldoConta());
        System.out.println("Saldo + Cheque Especial: "+cpFisica1.getSalContaDisponivel());

        System.out.println("Titular: "+pJuridica1.getRazaoSocial());
        System.out.println("Documento: "+pJuridica1.getCNPJ());
        System.out.println("Agencia: "+cpJuridica1.getAgencia());
        System.out.println("Numero da conta: "+cpJuridica1.getNconta());  
        System.out.println("Saldo: "+cpJuridica1.getSaldoConta());
        System.out.println("Saldo + Cheque Especial: "+cpJuridica1.getSalContaDisponivel());





    }
    
}
