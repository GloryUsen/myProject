package com.mbakara.service.servicelmpl;

import com.mbakara.Entity.User;
import com.mbakara.Repository.UserRepository;
import com.mbakara.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserRepository();
    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);

    }
}
