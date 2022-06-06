package com.example.finalProject.recipe;

import javax.persistence.*;

@Entity
public class RecipeIngredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int recipeId;
    private int ingredientsId;

}
