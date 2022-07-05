package com.example.finalProject.controller;

import com.example.finalProject.recipe.RecipeRepository;
import com.example.finalProject.user.User;
import com.example.finalProject.user.UserRepository;
import com.example.finalProject.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    private final RecipeRepository recipeRepository;
    private final UserRepository userRepository;

    private final UserService userService;

    public DashboardController(RecipeRepository recipeRepository, UserRepository userRepository, UserService userService) {
        this.recipeRepository = recipeRepository;
        this.userRepository = userRepository;
        this.userService = userService;
    }
    @RequestMapping(value = "/register" ,method = RequestMethod.GET)
    private String register(){
        return "register";
    }

    @RequestMapping(value = "/register" ,method = RequestMethod.POST)
    private String performRegister(User user){
       user.setEnabled(1);
       userService.saveUser(user);
       return "redirect:/login";
    }




}
