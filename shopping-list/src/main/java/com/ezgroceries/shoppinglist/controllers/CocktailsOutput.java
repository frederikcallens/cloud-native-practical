package com.ezgroceries.shoppinglist.controllers;

import java.util.UUID;

public class CocktailsOutput {
    UUID cocktailId;

    public CocktailsOutput() {

    }

    public void setCocktailId(UUID cocktailId) {
        this.cocktailId = cocktailId;
    }

    public UUID getCocktailId() {
        return this.cocktailId;
    }

}