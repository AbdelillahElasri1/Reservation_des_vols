package com.elasriabdelillah.reservation_vols.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Statistics")
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private int reservationConfirme;
    private int reservationAnnule;

    public Statistics(){

    }

    public Statistics(String id,int reservationConfirme, int reservationAnnule) {
        this.id = id;
        this.reservationConfirme = reservationConfirme;
        this.reservationAnnule = reservationAnnule;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getReservationConfirme() {
        return reservationConfirme;
    }

    public void setReservationConfirme(int reservationConfirme) {
        this.reservationConfirme = reservationConfirme;
    }

    public int getReservationAnnule() {
        return reservationAnnule;
    }

    public void setReservationAnnule(int reservationAnnule) {
        this.reservationAnnule = reservationAnnule;
    }


}
