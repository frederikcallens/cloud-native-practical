package com.ezgroceries.shoppinglist.controllers;

import com.ezgroceries.shoppinglist.persistence.ShoppingListEntity;
import com.ezgroceries.shoppinglist.services.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/shopping-lists", produces = "application/json")
public class ShoppingListController {

    @Autowired
    ShoppingListService shoppingListService;

    @PostMapping
    public ResponseEntity addShoppingList(@RequestBody ShoppingListInput input) {
        ShoppingListResource shoppingListResource = shoppingListService.create(input.getName());
        ShoppingListOutput output = new ShoppingListOutput();
        output.setName(input.getName());
        output.setShoppingListId(shoppingListResource.getShoppingListId());
        return new ResponseEntity(output, HttpStatus.CREATED);
    }

    /*
    TODO: Add Cocktails to Shopping List
    Replace the dummy resources and provide a real persisted implementation. This will include a service layer that
    will take care of linking cocktails with a specific shopping list.
     */
    @PostMapping(value = "/{id}/cocktails")
    public ResponseEntity addCocktail(@PathVariable("id") UUID shoppingListid, @RequestBody CocktailResource input) {
        List<String> ingredients = input.getIngredients();
        ShoppingListResource shoppingListResource = getDummyResources();
        shoppingListResource.addIngredients(ingredients);

        CocktailsOutput output = new CocktailsOutput();
        UUID id = input.getCocktailId();
        output.setCocktailId(id);
        return new ResponseEntity(output, HttpStatus.CREATED);
    }

    /*
    TODO: Get a Shopping List
    Replace the dummy resources and provide a real persisted implementation.

    This is also the API where most of our business value is going to happen! Implement the logic to retrieve
    all the Cocktails of the specific Shopping List and extract the distinct ingredients to include them
    in the response body.
     */
    @GetMapping(value = "/{shoppingListId}")
    public ResponseEntity getShoppingList(@PathVariable("shoppingListId") UUID shoppingListId) {
        ShoppingListResource output = getDummyResources();
        return new ResponseEntity(output, HttpStatus.OK);
    }

    /*
    TODO: Get all Shopping Lists
    Replace the dummy resources and provide a real persisted implementation.
     */
    @GetMapping
    public ResponseEntity getAllShoppingLists() {
        AllShoppingListsOutput output = new AllShoppingListsOutput();
        ArrayList<ShoppingListResource> list = new ArrayList<ShoppingListResource>();
        list.add(getDummyResources());
        output.setShoppingListResources(list);
        return new ResponseEntity(output, HttpStatus.OK);
    }
}
