package com.example.finalProject.ingredients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //wskazuje DAO w warstwie przechowywania danych
public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {

    Ingredients findByName (String name);
}
