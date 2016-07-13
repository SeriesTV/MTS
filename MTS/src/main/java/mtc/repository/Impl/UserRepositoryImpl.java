package mtc.repository.Impl;

import mtc.entity.User;
import mtc.service.HibernateSessionFactoryManager;
import mtc.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.mapping.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 * Created by Michal Czarnecki on 13.07.2016.
 */

public class UserRepositoryImpl implements UserRepository {

    private Session session;
    EntityManager entityManager;

    public void addUser(User user) {
        initializeSession();
        session.save(user);
        finishSession();
    }

    public void updateUser(User user) {
        initializeSession();
        session.update(user);
        finishSession();
    }

    public User getByUsername(String username){
        initializeSession();
        String hql = "from User where username =:username";
        org.hibernate.Query query = session.createQuery(hql);
        query.setParameter("username", username);
        User user = (User)query.uniqueResult();
        finishSession();
        return user;

    }

    private void initializeSession(){
        session = HibernateSessionFactoryManager.getSessionFactory().openSession();
        session.beginTransaction();
    }

    private void finishSession(){
        session.getTransaction().commit();
        session.close();
    }
}
