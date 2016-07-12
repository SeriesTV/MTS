package mtc;

import mtc.entity.User;
import mtc.service.HibernateService;
import mtc.service.impl.HibernateServiceImpl;
import org.hibernate.*;
import mtc.repository.HibernateSessionFactoryManager;

/**
 * Created by Michal Czarnecki on 12.07.2016.
 */
public class App {
    public static void main(String ... args){

        HibernateService hibernateService = new HibernateServiceImpl();
        User user = new User();
        user.setId(1);
        hibernateService.saveEntity(user);
        User user2 = new User();
        hibernateService.saveEntity(user2);
       // System.out.print("Hello world");
    }
}
