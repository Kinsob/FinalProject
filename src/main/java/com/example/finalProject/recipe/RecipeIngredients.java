package com.example.finalProject.recipe;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class RecipeIngredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ingredientsId;
    @Column(nullable = true)
    private Integer quantity; // ilość szt
    @Column(nullable = true)
    private int milliliter;  // ilość w mililitrach
    @Column(nullable = true)
    private int slice;  // ilość plasterków
    @Column(nullable = true)
    private int pinch; // szczypta

    @NotNull
    @ManyToOne
    private Recipe recipe;


    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIngredientsId() {
        return ingredientsId;
    }

    public void setIngredientsId(int ingredientsId) {
        this.ingredientsId = ingredientsId;
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

    public int getPinch() {
        return pinch;
    }

    public void setPinch(int pinch) {
        this.pinch = pinch;
    }
}
