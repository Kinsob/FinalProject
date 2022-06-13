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
    public String aZ(Model model) {
        model.addAttribute("recipes", recipeRepository.findAllByOrderByName());
        // wyświetla wszystkie przepisy posortowane od A - Z
        return "recipe";
    }

//    @GetMapping("/recipe/1")
//    public String Za(Model model) {
//        model.addAttribute("recipes", recipeRepository.findAllByOrderByNameDesc());
//        // wyświetla wszystkie przepisy posortowane od A - Z
//        return "redirect:/recipe";
//    }



//    @GetMapping("/recipeZa")
//    public String Za(Model model) {
//        model.addAttribute("allRecipes", recipeRepository.findAllByNameOrderByDescriptionNameDesc());
//        // wyświetla wszystkie przepisy posortowane od A - Z
//        return "recipeZA";
//    }
//
//    @GetMapping("/recipeByName")
//    public String byName(Model model) {
//        model.addAttribute("recipeByName", recipeRepository.findByName("Kamikaze"));
//        // wyświetla wszystkie przepisy posortowane od A - Z
//        return "recipeSortName";
//    }
//
//    @GetMapping("/recipeByCategory")
//    public String byCategory(Model model) {
//        model.addAttribute("recipeByCategory", recipeRepository.findAllByCategoryId(2L));
//        // wyświetla wszystkie przepisy posortowane od A - Z
//        return "recipeSortCategory";
//    }


}
