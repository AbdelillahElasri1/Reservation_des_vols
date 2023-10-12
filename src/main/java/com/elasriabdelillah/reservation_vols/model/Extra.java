package com.reservation.model;

public class Extra {
    private String name;
    private float tarif;
    public Extra(){

    }

    public Extra(String name, float tarif) {
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
}
