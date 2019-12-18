package com.ezgroceries.shoppinglist.services;

import java.util.ArrayList;
import java.util.List;

public class CocktailDBResponse {

    private List<DrinkResource> drinks;

    public List<DrinkResource> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<DrinkResource> drinks) {
        this.drinks = drinks;
    }

    public static class DrinkResource {
        public String idDrink;
        public String strDrink;
        public String strGlass;
        public String strInstructions;
        public String strDrinkThumb;
        public String strIngredient1;
        public String strIngredient2;
        public String strIngredient3;
        public String strIngredient4;
        public String strIngredient5;
        public String strIngredient6;
        public String strIngredient7;

        public List<String> getIngredients() {
            List<String> ingredients = new ArrayList<String>();
            ingredients.add(strIngredient1);
            ingredients.add(strIngredient2);
            ingredients.add(strIngredient3);
            ingredients.add(strIngredient4);
            ingredients.add(strIngredient5);
            ingredients.add(strIngredient6);
            ingredients.add(strIngredient7);
            return ingredients;
        }

        public String getIdDrink() {
            return this.idDrink;
        }

        public String getStrDrink() {
            return this.strDrink;
        }

        public String getStrGlass() {
            return this.strGlass;
        }

        public String getStrInstructions() {
            return this.strInstructions;
        }

        public String getStrDrinkThumb() {
            return this.strDrinkThumb;
        }
    }
}
