package com.example.finalProject.controller;

import com.example.finalProject.recipe.Recipe;
import com.example.finalProject.recipe.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/add")
    @ResponseBody
    public String showRecipe() {
        Recipe recipe = new Recipe();
        recipe.setName("recipe");
        recipe.setName("recipe");
        recipe.showRecipe(recipe);
        return "recipe";
    }

}
