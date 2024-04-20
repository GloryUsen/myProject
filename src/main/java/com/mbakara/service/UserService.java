package com.mbakara.service;

import com.mbakara.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
}
