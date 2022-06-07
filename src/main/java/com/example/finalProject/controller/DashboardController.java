package com.example.finalProject.controller;

import com.example.finalProject.recipe.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    private final RecipeRepository recipeRepository;

    public DashboardController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @RequestMapping("/register")
    private String register(){
        return "/register";
    }

    @RequestMapping("/login")
    private String login(){
        return "/login";
    }


}
