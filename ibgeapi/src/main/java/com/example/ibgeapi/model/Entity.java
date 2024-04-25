package com.example.ibgeapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "IBGE")
public class Entity {

    @Id
    private String id;
    private String tipo;
    private String titulo;
    private String introducao;

    public Entity(String id, String tipo, String titulo, String introducao){

        this.id = id;
        this.tipo = tipo;
        this.titulo = titulo;
        this.introducao = introducao;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }
}
