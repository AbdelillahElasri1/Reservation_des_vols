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
    @Column(name = "city_departure")
    private String city_departure;
    @Column(name = "city_arrival")
    private String city_arrival;
    @Column(name = "date_departure")
    private Date date_departure;
    @Column(name = "date_arrival")
    private Date date_arrival;
    @Column(name = "hour_departure")
    private Time hour_departure;
    @Column(name = "hour_arrival")
    private Time hour_arrival;
    @Column(name = "number_places")
    private int number_places;
    @Column(name = "tarif")
    private float tarif;
    @Column(name = "client_id")
    private Clients clients;
    @Column(name = "flight_id")
    private Flight flight;
    private Extra extra;
    public Reservations(){

    }

    public Reservations(String id, String city_departure, String city_arrival, Date date_departure, Date date_arrival, Time hour_departure, Time hour_arrival, int number_places, float tarif, Clients clients, Flight flight , Extra extra) {
        this.id = id;
        this.city_departure = city_departure;
        this.city_arrival = city_arrival;
        this.date_departure = date_departure;
        this.date_arrival = date_arrival;
        this.hour_departure = hour_departure;
        this.hour_arrival = hour_arrival;
        this.number_places = number_places;
        this.tarif = tarif;
        this.clients = clients;
        this.flight = flight;
        this.extra = extra;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
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
