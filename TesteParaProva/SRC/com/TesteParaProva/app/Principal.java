package TesteParaProva.SRC.com.TesteParaProva.app;

import TesteParaProva.SRC.com.TesteParaProva.modelo.PessoaFisica;
import TesteParaProva.SRC.com.TesteParaProva.modelo.PessoaJuridica;

public class Principal {
    public static void main(String[]args){
        PessoaFisica pFisica1=new PessoaFisica(1,"Pablo Mendes","01882847105", "61998233944","Qr 310 CJ 5A" , "03", "Samambaia Sul", "Brasilia", "DF", "72015605", "firefoxpablo@gmail.com");
        PessoaJuridica pJuridica1=new PessoaJuridica(2, "FLAG SISTEMAS", "22333444000155", "35501699", "SIA Trecho 3", "S/N", "Guará", "null", "DF", "71100000", "suporte@flagsistemas.com.br");
        
        System.out.println(pFisica1.getRazaoSocial());
        System.out.println(pJuridica1.getRazaoSocial());

    }
    
}
