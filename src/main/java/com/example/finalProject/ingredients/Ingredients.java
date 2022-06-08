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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMilliliter() {
        return milliliter;
    }

    public void setMilliliter(int milliliter) {
        this.milliliter = milliliter;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }
}
