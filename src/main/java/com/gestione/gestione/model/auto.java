package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.NonNull;

@Entity
@Table(name = "auto")

public class auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Column(name = "targa", nullable = false, length = 7)
    private String targa;

    @NonNull
    @Column(name = "marca", nullable = false, length = 30)
    private String marca;

    @NonNull
    @Column(name = "modello", nullable = false, length = 30)
    private String modello;

    @NonNull
    @Column(name = "fkproprietario",nullable = false)
    private int fkproprietario;


}
