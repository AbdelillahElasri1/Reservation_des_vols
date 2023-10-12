package com.elasriabdelillah.reservation_vols.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
@Entity
@Data
@Table(name = "Reservation")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String city_departure;
    private String city_arrival;
    private Date date_departure;
    private Date date_arrival;
    private Time hour_departure;
    private Time hour_arrival;
    private int number_places;
    private float tarif;
    private Extra extra;
    public Reservations(){

    }

    public Reservations(String id, String city_departure, String city_arrival, Date date_departure, Date date_arrival, Time hour_departure, Time hour_arrival, int number_places, float tarif, Extra extra) {
        this.id = id;
        this.city_departure = city_departure;
        this.city_arrival = city_arrival;
        this.date_departure = date_departure;
        this.date_arrival = date_arrival;
        this.hour_departure = hour_departure;
        this.hour_arrival = hour_arrival;
        this.number_places = number_places;
        this.tarif = tarif;
        this.extra = extra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity_departure() {
        return city_departure;
    }

    public void setCity_departure(String city_departure) {
        this.city_departure = city_departure;
    }

    public String getCity_arrival() {
        return city_arrival;
    }

    public void setCity_arrival(String city_arrival) {
        this.city_arrival = city_arrival;
    }

    public Date getDate_departure() {
        return date_departure;
    }

    public void setDate_departure(Date date_departure) {
        this.date_departure = date_departure;
    }

    public Date getDate_arrival() {
        return date_arrival;
    }

    public void setDate_arrival(Date date_arrival) {
        this.date_arrival = date_arrival;
    }

    public Time getHour_departure() {
        return hour_departure;
    }

    public void setHour_departure(Time hour_departure) {
        this.hour_departure = hour_departure;
    }

    public Time getHour_arrival() {
        return hour_arrival;
    }

    public void setHour_arrival(Time hour_arrival) {
        this.hour_arrival = hour_arrival;
    }

    public int getNumber_places() {
        return number_places;
    }

    public void setNumber_places(int number_places) {
        this.number_places = number_places;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }
}
