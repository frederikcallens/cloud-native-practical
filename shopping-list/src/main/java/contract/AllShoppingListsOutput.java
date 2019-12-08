package contract;

import model.ShoppingList;

import java.util.ArrayList;
import java.util.List;

public class AllShoppingListsOutput {
    ArrayList<ShoppingList> shoppingLists;

    public AllShoppingListsOutput() {

    }

    public void setShoppingLists(ArrayList<ShoppingList> shoppingLists) {
        this.shoppingLists = shoppingLists;
    }

    public ArrayList<ShoppingList> getShoppingLists() {
        return this.shoppingLists;
    }
}
