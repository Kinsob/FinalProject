package com.example.finalProject.controller;

import com.example.finalProject.recipe.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    private final Recipe recipe;

    public RecipeController(Recipe recipe) {
        this.recipe = recipe;
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
