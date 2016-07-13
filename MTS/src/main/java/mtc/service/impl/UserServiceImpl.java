package mtc.service.impl;

import mtc.entity.User;
import mtc.repository.Impl.UserRepositoryImpl;
import mtc.repository.UserRepository;
import mtc.service.UserService;

/**
 * Created by Michal Czarnecki on 13.07.2016.
 */
public class UserServiceImpl implements UserService{

    private UserRepository userRepository = new UserRepositoryImpl();

    public UserServiceImpl(){

    }

    public void addUser(User user){
        userRepository.addUser(user);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public User getByUsername(String username) {
        return userRepository.getByUsername(username);
    }

}
