package com.reservation.model;

import java.sql.Time;
import java.util.Date;

public class Flight {
    private String id;
    private String name;
    private String description;
    private String city_departure;
    private String city_arrival;
    private Time hour_departure;
    private Time hour_arrival;
    private Date date_departure;
    private Date date_arrival;
    private Reservations reservations;
    public Flight(){

    }

    public Flight(String id, String name, String description, String city_departure, String city_arrival, Time hour_departure, Time hour_arrival, Date date_departure, Date date_arrival, Reservations reservations) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.city_departure = city_departure;
        this.city_arrival = city_arrival;
        this.hour_departure = hour_departure;
        this.hour_arrival = hour_arrival;
        this.date_departure = date_departure;
        this.date_arrival = date_arrival;
        this.reservations = reservations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Reservations getReservations() {
        return reservations;
    }

    public void setReservations(Reservations reservations) {
        this.reservations = reservations;
    }
}
