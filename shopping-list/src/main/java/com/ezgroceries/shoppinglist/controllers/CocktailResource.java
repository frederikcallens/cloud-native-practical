package com.ezgroceries.shoppinglist.controllers;

import java.util.List;
import java.util.UUID;

public class CocktailResource {
    UUID cocktailId;
    String name;
    String glass;
    String instructions;
    String image;
    List<String> ingredients;

    public CocktailResource(UUID cocktailId, String name, String glass, String instructions, String image, List<String> ingredients) {
        this.cocktailId = cocktailId;
        this.name = name;
        this.glass = glass;
        this.instructions = instructions;
        this.image = image;
        this.ingredients = ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }

    public void setCocktailId(UUID id) {
        this.cocktailId = id;
    }

    public UUID getCocktailId() {
        return this.cocktailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getGlass() {
        return this.glass;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }
}
