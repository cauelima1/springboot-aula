package com.aulaspringboot.aula.curso.bean;

public class Cursos {
    private long id;
    private String nome;
    private String assunto;


    public Cursos(long id, String nome, String assunto) {
        this.id = id;
        this.nome = nome;
        this.assunto = assunto;
    }



    public String toString() {
        return "Curso- id: " + id + ", nome: " + nome + ", assunto: " + assunto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
