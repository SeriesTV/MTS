package mtc.service.impl;

import mtc.entity.User;
import mtc.repository.HibernateSessionFactoryManager;
import mtc.service.HibernateService;
import org.hibernate.Session;

/**
 * Created by Michal Czarnecki on 12.07.2016.
 */
public class HibernateServiceImpl<T> implements HibernateService<T> {


    public void saveEntity(T entity) {
        Session session = HibernateSessionFactoryManager.getSessionFactory().openSession();

        session.beginTransaction();

        session.save(entity);
        session.getTransaction().commit();
    }
}
