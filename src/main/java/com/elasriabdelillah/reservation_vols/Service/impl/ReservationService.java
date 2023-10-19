package com.elasriabdelillah.reservation_vols.Service.impl;

import com.elasriabdelillah.reservation_vols.Dao.impl.ReservationDao;
import com.elasriabdelillah.reservation_vols.Service.IReservationService;
import com.elasriabdelillah.reservation_vols.model.Reservations;

import java.util.List;

public class ReservationService implements IReservationService {
    private final ReservationDao reservationDao = new ReservationDao();

    public ReservationService() {
    }


    @Override
    public Reservations saveReservation(Reservations reservations) {
        if (reservationDao.saveReservation(reservations) != null){
            return reservations;
        } else {
            return null;
        }
    }

    @Override
    public Reservations updateReservation(Reservations reservations, String id) {
        if (reservationDao.updateReservation(reservations,id) != null){
            return reservations;
        } else {
            return null;
        }
    }

    @Override
    public void deleteReservation(String id) {
//        if (reservationDao.deleteReservation(id) != null){
//            System.out.println("row deleted with success.");
//        }else {
//            System.out.println("row does not deleted.");
//        }
        reservationDao.deleteReservation(id);
    }

    @Override
    public Reservations getReservation(String id) {
        if (reservationDao.getReservation(id) != null){
            return reservationDao.getReservation(id);
        } else {
            return null;
        }
    }

    @Override
    public List<Reservations> getAllReservations() {
        if (reservationDao.getAllReservation() != null){
            List<Reservations> reservationsList = reservationDao.getAllReservation();
            return reservationsList;
        }else {
            return null;
        }
    }
}
