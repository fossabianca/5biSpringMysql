package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Entity
@Table(name = "auto")

public class auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Getter @Setter private int id;

    
    @NonNull
    @Column(name = "targa", nullable = false)
    @Getter @Setter private String targa;

    

    @NonNull
    @Column(name = "marca", nullable = false)
    @Getter @Setter private String marca;

 

    @NonNull
    @Column(name = "modello", nullable = false)
    @Getter @Setter private String modello;

    

    @NonNull
    @Column(name = "fkproprietario",nullable = false)
    @Getter @Setter private int fkproprietario;


}
