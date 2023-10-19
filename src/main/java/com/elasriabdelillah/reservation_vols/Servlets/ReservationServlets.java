package com.elasriabdelillah.reservation_vols.Servlets;

import com.elasriabdelillah.reservation_vols.Service.IReservationService;
import com.elasriabdelillah.reservation_vols.Service.impl.ReservationService;
import com.elasriabdelillah.reservation_vols.model.Reservations;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ReservationServlets", value = "/reservation")
public class ReservationServlets extends HttpServlet {
    private ReservationService reservationService;
    public ReservationServlets(){

    }

    public ReservationServlets(ReservationService reservationService) {
        super();
        this.reservationService = reservationService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        if (reservationService != null){
            reservationService.getReservation("dsds");
        } else {
            resp.getWriter().write("reservation is not initialized");
        }
        String id = req.getParameter("id");
        Reservations reservations = reservationService.getReservation(id);
        System.out.println("print id : " + id);

        req.setAttribute("reservation", reservations);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        this.reservationService = new ReservationService();
    }
}
