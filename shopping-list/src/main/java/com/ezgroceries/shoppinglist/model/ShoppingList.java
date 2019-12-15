package com.ezgroceries.shoppinglist.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShoppingList {
    UUID shoppingListId;
    String name;
    List<String> ingredients;

    public ShoppingList(String name) {
        this.shoppingListId = UUID.randomUUID();
        this.name = name;
        this.ingredients = new ArrayList<String>();
    }

    public void addIngredients(List<String> ingredients) {
        this.ingredients.addAll(ingredients);
    }

    public UUID getShoppingListId() {
        return this.shoppingListId;
    }

    public String getName() { return this.name; }

    public List<String> getIngredients() { return this.ingredients; }
}
