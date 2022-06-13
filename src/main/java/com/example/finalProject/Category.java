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
    private String name;

    // long o objętości 50 ml lub mniejszej
    // short o objętości 60-100 ml
    // shot o objętości pow. 100 ml

}
