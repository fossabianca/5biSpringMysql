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

    @NonNull
    @Column(name = "nome", nullable = false)
    private String nome;

    @NonNull
    @Column(name = "cognome", nullable = false)
    private String cognome;

    @NonNull
    @Column(name = "telefono", nullable = false)
    private String telefono;
    
    public int getId()
    {
        return id;        
    }

    public String getNome()
    {
        return nome;        
    }

    public String getCognome()
    {
        return cognome;        
    }

    public String getTelefono()
    {
        return telefono;        
    }

    public void setId(int id)
    {
        this.id = id;        
    }

    public void setNome(String nome)
    {
        this.nome = nome;        
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;        
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;        
    }

}
