package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.NonNull;

@Entity
@Table(name = "auto")

public class auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @NonNull
    @Column(name = "targa", nullable = false)
    private String targa;

    @NonNull
    @Column(name = "marca", nullable = false)
    private String marca;

    @NonNull
    @Column(name = "modello", nullable = false)
    private String modello;

    @NonNull
    @Column(name = "fkproprietario",nullable = false)
    private int fkproprietario;


}
