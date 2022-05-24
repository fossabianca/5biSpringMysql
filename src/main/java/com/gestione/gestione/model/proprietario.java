package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.NonNull;

@Entity
@Table(name = "proprietario")

public class proprietario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @NonNull
    @Column(name = "nome", nullable = false)
    private String nome;

    @NonNull
    @Column(name = "cognome", nullable = false)
    private String cognome;

    @NonNull
    @Column(name = "telefono", nullable = false)
    private String telefono;
    

}
