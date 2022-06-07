package com.example.finalProject.controller;

import com.example.finalProject.user.User;
import com.example.finalProject.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setUsername("Marek");
        user.setPassword("12345");
        userService.saveUser(user);
        return "admin add";
    }

}