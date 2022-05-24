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

    public String getModello() {
        return this.modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getTarga() {
        return this.targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
     
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
      
    public int getFkproprietario() {
        return this.fkproprietario;
    }

    public void setFkproprietario(int fkproprietario) {
        this.fkproprietario = fkproprietario;
    }
}
