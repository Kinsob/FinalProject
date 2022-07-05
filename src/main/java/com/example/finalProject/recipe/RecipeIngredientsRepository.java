package com.example.finalProject.recipe;

import com.example.finalProject.ingredients.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredients, Long> {

    @Query(value ="SELECT * FROM recipe_ingredients RIGHT JOIN ingredients i on i.id = recipe_ingredients.ingredients_id WHERE recipe_id=1",
            nativeQuery = true)
    List<RecipeIngredients> findAllIngredientsByRecipe();

    @Query("select i from Ingredients  i join RecipeIngredients ri on i.id = ri.ingredientsId where ri.recipe.id = ?1")
    List<Ingredients> findAllByRecipeId(Long id);

}
