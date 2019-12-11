package com.ezgroceries.shoppinglist.model;

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

    public List<String> getIngredients() {
        return this.ingredients;
    }

    public UUID getCocktailId() {
        return this.cocktailId;
    }
}
