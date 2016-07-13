package mtc.service;

import mtc.entity.User;

/**
 * Created by Michal Czarnecki on 12.07.2016.
 */
public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    User getByUsername(String username);

}
