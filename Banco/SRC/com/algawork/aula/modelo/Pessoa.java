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
}
