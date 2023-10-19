package com.elasriabdelillah.reservation_vols.Dao.impl;

import com.elasriabdelillah.reservation_vols.Dao.IReservationDao;
import com.elasriabdelillah.reservation_vols.Util.HibernateUtil;
import com.elasriabdelillah.reservation_vols.model.Reservations;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ReservationDao implements IReservationDao {
    @Override
    public Reservations saveReservation(Reservations reservations) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(reservations);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
            
        }
        return reservations;
    }

    @Override
    public Reservations updateReservation(Reservations reservations, String id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            Reservations reservations1 = session.get(Reservations.class, id);
            session.update(reservations1);
            transaction.commit();
        } catch(Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteReservation(String id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Reservations reservations = entityManager.find(Reservations.class,id);
        entityManager.remove(reservations);
        entityManager.getTransaction().commit();
    }

    @Override
    public Reservations getReservation(String id) {
//        Transaction transaction = null;
//        Reservations reservations = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()){
//            transaction = session.beginTransaction();
//            reservations = session.get(Reservations.class,id);
//            transaction.commit();
//        } catch (Exception e){
//            if (transaction != null){
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        return reservations;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Reservations reservations = entityManager.find(Reservations.class,id);
        entityManager.getTransaction().commit();
        return reservations;
    }

    @Override
    public List<Reservations> getAllReservation() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            String hql = "from Reservations ";
            Query<Reservations> query = session.createQuery(hql, Reservations.class);
            return query.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
