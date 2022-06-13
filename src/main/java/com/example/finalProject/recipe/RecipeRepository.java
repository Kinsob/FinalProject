package com.example.finalProject.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    //tutaj są wszystkie zapytania crud oraz wiele innych zapytań do bazy danych

    List<Recipe> findAllByOrderByName();
    //List<Recipe> findAllByOrderByNameDesc();


//    List<Recipe> findAllByNameOrderByDescriptionNameDesc();  //sortowanie od Z - A
//
//    List<Recipe> findByName(String name);  //wyszukiwanie weług nazwy
//
//    List<Recipe> findAllByCategoryId(Long category_id);  //wyszukiwanie według kategorii
//

}
