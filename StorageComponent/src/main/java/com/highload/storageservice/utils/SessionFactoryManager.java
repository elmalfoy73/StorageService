package com.highload.storageservice.utils;

import com.highload.storageservice.Entities.KVPair;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryManager {

    private static SessionFactory sessionFactory;

    private SessionFactoryManager() {}

    public static synchronized SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
                configuration.addAnnotatedClass(KVPair.class);

                StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();
                sessionFactory = configuration.buildSessionFactory(standardRegistry);
            } catch (Throwable e) {
                System.err.println("Failed to create sessionFactory object." + e);
                throw new ExceptionInInitializerError(e);
            }
        }
        return sessionFactory;
    }
}