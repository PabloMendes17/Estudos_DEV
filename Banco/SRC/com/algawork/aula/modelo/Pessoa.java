package com.algawork.aula.modelo;

import java.time.LocalDateTime;

public class Pessoa {
    private String nome;
    private String documento;
    private TipoPessoa tipo=TipoPessoa.FISICA;
    private LocalDateTime dataUltimaAtualizacao=LocalDateTime.now();

    public Pessoa(){}

    public Pessoa(String nome, String documento){
        this.nome=nome;
        this.documento=documento;
    }




    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento=documento;
    }
    public TipoPessoa getTipo() {
        return tipo;
    }
    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }
    public LocalDateTime getdataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }
    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", documento=" + documento + ", tipo=" + tipo + "]";
    }


    /*estes métodos são para melhoria de eficiencia no uso do haslist
    fazendo com que as comparações de fato encontre os iguais foi gerado 
    automaticamente pela IDE não é obrigatório que seja esta logica*/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((documento == null) ? 0 : documento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (documento == null) {
            if (other.documento != null)
                return false;
        } else if (!documento.equals(other.documento))
            return false;
        return true;
    }



    
}
