package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.NonNull;

@Entity
@Table(name = "proprietario")

public class proprietario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    @NonNull
    @Column(name = "cognome", nullable = false, length = 30)
    private String cognome;

    @NonNull
    @Column(name = "telefono", nullable = false, length = 30)
    private String telefono;
    

}
