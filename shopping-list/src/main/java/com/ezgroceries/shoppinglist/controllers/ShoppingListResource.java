package com.ezgroceries.shoppinglist.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShoppingListResource {
    UUID shoppingListId;
    String name;
    List<String> ingredients;

    public ShoppingListResource(UUID id, String name) {
        this.shoppingListId = id;
        this.name = name;
        this.ingredients = new ArrayList<String>();
    }

    public UUID getShoppingListId() {
        return this.shoppingListId;
    }

    public String getName() { return this.name; }

    public void addIngredients(List<String> ingredients) {
        this.ingredients.addAll(ingredients);
    }

    public List<String> getIngredients() { return this.ingredients; }
}
