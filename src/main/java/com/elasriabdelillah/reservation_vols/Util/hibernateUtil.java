package com.elasriabdelillah.reservation_vols.Util;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {
    @Getter
    private static final SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }
}
