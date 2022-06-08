package com.example.finalProject.controller;

import com.example.finalProject.ingredients.Ingredients;
import com.example.finalProject.ingredients.IngredientsRepository;
import com.example.finalProject.recipe.Recipe;
import com.example.finalProject.recipe.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RecipeController {

    private final RecipeRepository recipeRepository;
    private final IngredientsRepository ingredientsRepository;

    public RecipeController(RecipeRepository recipeRepository, IngredientsRepository ingredientsRepository) {
        this.recipeRepository = recipeRepository;
        this.ingredientsRepository = ingredientsRepository;
    }

    @GetMapping("/recipe")
    public String showRecipe(Model model) {
        List<Ingredients> all = ingredientsRepository.findAll();
        model.addAttribute("all",all);
        return "recipe";
    }

}
