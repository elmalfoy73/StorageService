package com.highload.storageservice.service;

import com.highload.storageservice.Entities.KVPair;
import com.highload.storageservice.utils.SessionFactoryManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class StorageComponentService {
    public static void savePair(KVPair pair) {
        if (pair == null) throw new NullPointerException();

        Session session = SessionFactoryManager.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.persist(pair);
        session.getTransaction().commit();
        session.close();
    }

    public static KVPair getValue(String key) {
        if (key == null) throw new NullPointerException();

        Session session = SessionFactoryManager.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<KVPair> result = session.createQuery("FROM KVPair WHERE key = :key").setParameter("key", key).list();
        session.getTransaction().commit();
        session.close();

        return result.get(0);
    }
}
