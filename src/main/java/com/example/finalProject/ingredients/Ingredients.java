package com.example.finalProject.ingredients;

import javax.persistence.*;

@Entity
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantity; // ilość szt
    private int milliliter;  // ilość w mililitrach
    private int slice;  // ilość plasterków
    private int gram; //ilość gram

}
