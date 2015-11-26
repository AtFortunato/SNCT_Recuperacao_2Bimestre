package com.example.ifpb.snct_rec2;

/**
 * Created by IFPB on 24/11/2015.
 */
public class Formulario {

    private int id;
    private String nome_avaliador;
    private String titulo_trabalho;
    private int nota;
    private String comentario;

    public Formulario(){
       super();

    }
    public Formulario(String nome_avaliador, String titulo_trabalho, int nota, String comentario){
        this.nome_avaliador = nome_avaliador;
        this.titulo_trabalho = titulo_trabalho;
        this.nota = nota;
        this.comentario = comentario;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public String getNome_avaliador() {
        return nome_avaliador;
    }

    public String getTitulo_trabalho() {
        return titulo_trabalho;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setNome_avaliador(String nome_avaliador) {
        this.nome_avaliador = nome_avaliador;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "id=" + id +
                ", nome_avaliador='" + nome_avaliador + '\'' +
                ", titulo_trabalho='" + titulo_trabalho + '\'' +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }

    public void setTitulo_trabalho(String titulo_trabalho) {
        this.titulo_trabalho = titulo_trabalho;


    }
}
