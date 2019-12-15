package com.ezgroceries.shoppinglist.contract;

import com.ezgroceries.shoppinglist.model.ShoppingList;

import java.util.List;

public class AllShoppingListsOutput {
    List<ShoppingList> shoppingLists;

    public AllShoppingListsOutput() {

    }

    public void setShoppingLists(List<ShoppingList> shoppingLists) {
        this.shoppingLists = shoppingLists;
    }

    public List<ShoppingList> getShoppingLists() {
        return this.shoppingLists;
    }
}
