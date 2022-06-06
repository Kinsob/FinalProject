package com.example.finalProject.user;

public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}