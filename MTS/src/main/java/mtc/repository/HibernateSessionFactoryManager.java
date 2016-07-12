package mtc.repository;

import mtc.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Michal Czarnecki on 12.07.2016.
 */
public class HibernateSessionFactoryManager {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private HibernateSessionFactoryManager(){

    }

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure()
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        sessionFactory.close();
    }
}
