package com.example.finalProject;

import com.example.finalProject.recipe.Recipe;
import com.example.finalProject.user.User;

import javax.persistence.*;

@Entity
public class UserFavouriteRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean heart;
    @ManyToOne
    private User user;

    @ManyToOne
    private Recipe recipe;
}
