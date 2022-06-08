package com.example.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavouriteController {

    @GetMapping("/favourite")
    public String showRecipe() {
        return "favourite";
    }
}
