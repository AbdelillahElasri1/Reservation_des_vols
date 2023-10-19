package com.elasriabdelillah.reservation_vols.Service;

import com.elasriabdelillah.reservation_vols.model.Reservations;

import java.util.List;

public interface IReservationService {
    Reservations saveReservation(Reservations reservations);
    Reservations updateReservation(Reservations reservations, String id);
    void deleteReservation(String id);
    Reservations getReservation(String id);
    List<Reservations> getAllReservations();
}
