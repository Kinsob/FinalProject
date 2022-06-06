package com.example.finalProject.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    //tutaj są wszystkie zapytania crud oraz wiele innych zapytań do bazy danych

}
