package com.example.finalProject.recipe;

import com.example.finalProject.ingredients.Ingredients;
import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.*;

@Entity
public class RecipeIngredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int ingredientsId;
    @Column(nullable = false)
    private int quantity; // ilość szt
    @MaybeNull
    private int milliliter;  // ilość w mililitrach
    @MaybeNull
    private int slice;  // ilość plasterków
    @MaybeNull
    private int gram; // ilość gram
    @MaybeNull
    private int pinch; // szczypta

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

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public int getPinch() {
        return pinch;
    }

    public void setPinch(int pinch) {
        this.pinch = pinch;
    }
}
