package com.ezgroceries.shoppinglist.controllers;

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
        return shoppingListService.create(new ShoppingListResource(input.name));
        ShoppingListResource shoppingListResource = new ShoppingListResource(input.getName());
        ShoppingListOutput output = new ShoppingListOutput();
        output.setName(input.getName());
        output.setShoppingListId(shoppingListResource.getShoppingListId());
        return new ResponseEntity(output, HttpStatus.CREATED);
    }

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

    @GetMapping(value = "/{shoppingListId}")
    public ResponseEntity getShoppingList(@PathVariable("shoppingListId") UUID shoppingListId) {
        ShoppingListResource output = getDummyResources();
        return new ResponseEntity(output, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllShoppingLists() {
        AllShoppingListsOutput output = new AllShoppingListsOutput();
        ArrayList<ShoppingListResource> list = new ArrayList<ShoppingListResource>();
        list.add(getDummyResources());
        output.setShoppingListResources(list);
        return new ResponseEntity(output, HttpStatus.OK);
    }

    public ShoppingListResource getDummyResources() {
        ShoppingListResource shoppingListResource = new ShoppingListResource("Stephanie's birthday");
        shoppingListResource.addIngredients(Arrays.asList("Tequila", "Triple sec", "Lime juice", "Salt", "Blue Curacao"));

        return shoppingListResource;
    }
}
