package com.elasriabdelillah.reservation_vols.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "extra")
public class Extra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "tarif")
    private float tarif;

    public Extra(){

    }

    public Extra(String id ,String name, float tarif) {
        this.id = id;
        this.name = name;
        this.tarif = tarif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
