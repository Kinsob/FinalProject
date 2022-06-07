package com.example.finalProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shot;          //o objętości 50 ml lub mniejszej
    private String shortDrink;   // o objętości 60-100 ml
    private String longDrink;   //o objętości pow. 100 ml


}
