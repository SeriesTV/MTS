package mtc;

import mtc.entity.User;
import mtc.service.HibernateSessionFactoryManager;
import mtc.service.UserService;
import mtc.service.impl.UserServiceImpl;

/**
 * Created by Michal Czarnecki on 12.07.2016.
 */
public class App {
    public static void main(String ... args){

        User user = new User(1, "Mike", "mich@cos.com", "aaaaaa");
        UserService userService = new UserServiceImpl();
        userService.addUser(user);
        userService.addUser(user);
        userService.addUser(user);
        user.setUsername("Krzysztof");
        userService.updateUser(user);
        User user2 = userService.getByUsername("Krzysztof");
        HibernateSessionFactoryManager.shutdown();

    }
}
