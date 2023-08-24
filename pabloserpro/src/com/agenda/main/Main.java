package com.agenda.main;

import java.util.Date;

import com.agenda.dao.ContatoDAO;
import com.agenda.model.Contato;

import TesteParaProva.SRC.com.TesteParaProva.modelo.Conta;

public class Main {
    public static void main(String[]args){
        Contato contato = new Contato();
        contato.setNome("Will Justos");
        contato.setIdade(27);
        contato.setDataCadastro(new Date());
        
        ContatoDAO contatoDao=new ContatoDAO();

        //contatoDao.save(contato);
        //contatoDao.savep(contato);

        for(Contato c : contatoDao.getContatos()){

            System.out.println ("Contato: "+c.getNome());
        };

        for(Contato c : contatoDao.getContatosp()){

            System.out.println ("Contato: "+c.getNome());
        };

            Contato upContato = new Contato();

        upContato.setNome("Willson Justos");
        upContato.setIdade(25);
        upContato.setDataCadastro(new Date());
        upContato.setId(2);

        contatoDao.update(upContato);
        contatoDao.updatep(upContato);

        contatoDao.delete(1);


    






    }
    
}
