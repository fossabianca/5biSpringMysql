package com.gestione.gestione.model;

import javax.persistence.*;

import lombok.NonNull;


@Entity
@Table(name = "auto")

public class auto {

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
    @Column(name = "targa", nullable = false)
    private String targa;

    public String getTarga() {
        return this.targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @NonNull
    @Column(name = "marca", nullable = false)
    private String marca;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @NonNull
    @Column(name = "modello", nullable = false)
    private String modello;

    public String getModello() {
        return this.modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @NonNull
    @Column(name = "fkproprietario",nullable = false)
    private int fkproprietario;

    public int getFkproprietario() {
        return this.fkproprietario;
    }

    public void setFkproprietario(int fkproprietario) {
        this.fkproprietario = fkproprietario;
    }


}
