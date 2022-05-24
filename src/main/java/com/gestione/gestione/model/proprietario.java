package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "proprietario")

public class proprietario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Getter @Setter private int id;

    @NonNull
    @Column(name = "nome", nullable = false)
    @Getter @Setter private String nome;

    @NonNull
    @Column(name = "cognome", nullable = false)
    @Getter @Setter private String cognome;

    @NonNull
    @Column(name = "telefono", nullable = false)
    @Getter @Setter private String telefono;

}
