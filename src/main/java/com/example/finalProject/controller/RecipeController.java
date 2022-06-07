package com.example.finalProject.controller;

import com.example.finalProject.recipe.Recipe;
import com.example.finalProject.recipe.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/recipe")
    public String showRecipe() {
        return "recipe";
    }

}
