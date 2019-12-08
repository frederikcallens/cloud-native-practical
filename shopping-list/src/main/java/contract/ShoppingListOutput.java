package contract;

import java.util.UUID;

public class ShoppingListOutput {
    String name;
    UUID shoppingListId;

    public ShoppingListOutput() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setShoppingListId(UUID id) { this.shoppingListId = id; }

    public UUID getShoppingListId() { return this.shoppingListId; }
}
