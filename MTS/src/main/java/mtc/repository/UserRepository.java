package mtc.repository;

import mtc.entity.User;

/**
 * Created by Michal Czarnecki on 13.07.2016.
 */
public interface UserRepository {

    void addUser(User user);

    void updateUser(User user);

    User getByUsername(String username);


}
