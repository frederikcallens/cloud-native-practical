package com.ezgroceries.shoppinglist.services;

import com.ezgroceries.shoppinglist.controllers.ShoppingListResource;
import com.ezgroceries.shoppinglist.persistence.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingListService {

    private final ShoppingListRepository shoppingListRepository;

    public ShoppingListService(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }

    public ShoppingListResource create(ShoppingListResource shoppingListResource) {

        return shoppingListResource;
    }
}
