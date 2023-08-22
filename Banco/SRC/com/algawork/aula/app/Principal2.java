package com.algawork.aula.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.ToIntFunction;

import com.algawork.aula.modelo.Pessoa;

public  class Principal2 {
    public static void main(String[]args){

    Pessoa pessoa1 = new Pessoa("Joao Da Silva","325698");
    //System.out.println(pessoa1);quando é feito a chamada direto no objeto ele retorna 
    //System.out.println(pessoa1.toString()); o endereço de memoria, podemos usar o toString
    // criar um construtor para que seja impresso oque desejamos

    Pessoa pessoa2 =new Pessoa("Angela Gilberta","951753");
    Pessoa pessoa3 =new Pessoa("Angela Gilberta","951753");    

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(pessoa1);    
    pessoas.add(pessoa2);
    System.out.println(pessoas);

    for(int i=0; i<pessoas.size(); i++){
        System.out.println(pessoas.get(i).getNome());
    }

    for(Pessoa pessoa :pessoas){// é um for para lista reduzido
        System.out.println(pessoa.getNome());
    }

    boolean contem = pessoas.contains(pessoa1);//método de verificação no array
    System.out.println(contem);//que procura um termo e compara o objeto
    boolean dentro = pessoas.contains(pessoa3);
    System.out.println(dentro);
    System.out.println(pessoa1.equals(pessoa3));//mesmo com o conteudo igual eles tem referencias 
    //diferentes, caso deseje que ele compare por algo do conteúdo devera subscrever o método


    Pessoa pessoaSet1 = new Pessoa("Pablo Mendes","9424");
    Pessoa pessoaSet2 = new Pessoa("Raiane Maria","091");
    Pessoa pessoaSet3 = new Pessoa("Chopp Wilson","000");
    Pessoa pessoaSet4 = new Pessoa("Elcy Maria","777");

    Set<Pessoa> pessoaSet = new HashSet<>();//Método set não tem indice
    pessoaSet.add(pessoaSet1);
    pessoaSet.add(pessoaSet2);
    pessoaSet.add(pessoaSet3);
    pessoaSet.add(pessoaSet4);

     for(Pessoa pessoa :pessoaSet){// é um for para lista reduzido
        System.out.println(pessoa.getNome());

   



    }







    }
    
}