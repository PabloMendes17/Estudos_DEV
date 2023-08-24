package com.devribeiro.models;
import com.devribeiro.enuns.Status;

public class Task {

    private int id;
    private String nome;
    private Status status; 

    public Task(int id, String nome, Status status){
        this.id=id;
        this.nome=nome;
        this.status=status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
