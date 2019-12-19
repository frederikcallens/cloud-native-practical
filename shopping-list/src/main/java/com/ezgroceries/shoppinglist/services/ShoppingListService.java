package com.ezgroceries.shoppinglist.services;

import com.ezgroceries.shoppinglist.controllers.ShoppingListResource;
import com.ezgroceries.shoppinglist.persistence.ShoppingListEntity;
import com.ezgroceries.shoppinglist.persistence.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShoppingListService {

    private final ShoppingListRepository shoppingListRepository;

    public ShoppingListService(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }

    public ShoppingListResource create(String name) {
        ShoppingListEntity newShoppingListEntity = new ShoppingListEntity();
        newShoppingListEntity.setId(UUID.randomUUID());
        newShoppingListEntity.setName(name);

        ShoppingListEntity shoppingListEntity = shoppingListRepository.save(newShoppingListEntity);
        return new ShoppingListResource(shoppingListEntity.getId(), shoppingListEntity.getName());
    }
}
