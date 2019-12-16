package com.ezgroceries.shoppinglist.controllers;

import com.ezgroceries.shoppinglist.model.ShoppingListResource;

import java.util.List;

public class AllShoppingListsOutput {
    List<ShoppingListResource> shoppingListResources;

    public AllShoppingListsOutput() {

    }

    public void setShoppingListResources(List<ShoppingListResource> shoppingListResources) {
        this.shoppingListResources = shoppingListResources;
    }

    public List<ShoppingListResource> getShoppingListResources() {
        return this.shoppingListResources;
    }
}
