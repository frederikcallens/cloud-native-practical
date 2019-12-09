package contract;

import model.ShoppingList;

import java.util.ArrayList;
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
