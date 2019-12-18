package com.ezgroceries.shoppinglist.persistence;

import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface ShoppingListRepository extends Repository<ShoppingListEntity, UUID> {

}
