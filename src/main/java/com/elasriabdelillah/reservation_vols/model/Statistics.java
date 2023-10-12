package com.reservation.model;

public class Statistics {
    private int reservationConfirme;
    private int reservationAnnule;
    public Statistics(){

    }

    public Statistics(int reservationConfirme, int reservationAnnule) {
        this.reservationConfirme = reservationConfirme;
        this.reservationAnnule = reservationAnnule;
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
