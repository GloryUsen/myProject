package com.mbakara.Repository;

import com.mbakara.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository(){
        users = new ArrayList<>(); // initialising the list of users.
    }



    public void addUser(User user){
        users.add(user);

    }

    public List<User> getAllUsers(){
        return users;
    }

}
