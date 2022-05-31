package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.NonNull;


@Entity
@Table(name = "proprietario")

public class proprietario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    @Column(name = "nome", nullable = false)
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @NonNull
    @Column(name = "cognome", nullable = false)
     private String cognome;

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @NonNull
    @Column(name = "telefono", nullable = false)
    private String telefono;

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
