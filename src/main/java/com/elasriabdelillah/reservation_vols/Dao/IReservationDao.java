package com.elasriabdelillah.reservation_vols.Dao;

import com.elasriabdelillah.reservation_vols.model.Reservations;

import java.util.List;

public interface IReservationDao {
    Reservations saveReservation(Reservations reservations);
    Reservations updateReservation(Reservations reservations);
    void deleteReservation(String id);
    Reservations getReservation(String id);
    List<Reservations> getAllReservation();

}
