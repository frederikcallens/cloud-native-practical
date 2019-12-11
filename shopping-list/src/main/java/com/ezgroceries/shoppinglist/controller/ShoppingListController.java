package com.ezgroceries.shoppinglist.controller;

import com.ezgroceries.shoppinglist.contract.*;
import com.ezgroceries.shoppinglist.contract.CocktailsOutput;
import com.ezgroceries.shoppinglist.model.ShoppingList;
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

    @PostMapping
    public ResponseEntity addShoppingList(@RequestBody ShoppingListInput input) {
        ShoppingList shoppingList = new ShoppingList(input.getName());
        ShoppingListOutput output = new ShoppingListOutput();
        output.setName(input.getName());
        output.setShoppingListId(shoppingList.getShoppingListId());
        return new ResponseEntity(output, HttpStatus.CREATED);
    }

    @PostMapping(value = "/{id}/cocktails")
    public ResponseEntity addCocktail(@PathVariable("id") UUID shoppingListid, @RequestBody CocktailsInput input) {
        List<String> ingredients = input.getCocktail().getIngredients();
        ShoppingList shoppingList = getDummyResources();
        shoppingList.addIngredients(ingredients);

        CocktailsOutput output = new CocktailsOutput();
        output.setCocktailId(input.getCocktail().getCocktailId());
        return new ResponseEntity(output, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{shoppingListId}")
    public ResponseEntity getShoppingList(@PathVariable("shoppingListId") UUID shoppingListId) {
        ShoppingList output = getDummyResources();
        return new ResponseEntity(output, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllShoppingLists() {
        AllShoppingListsOutput output = new AllShoppingListsOutput();
        ArrayList<ShoppingList> list = new ArrayList<ShoppingList>();
        list.add(getDummyResources());
        output.setShoppingLists(list);
        return new ResponseEntity(output, HttpStatus.OK);
    }

    public ShoppingList getDummyResources() {
        ShoppingList shoppingList = new ShoppingList("Stephanie's birthday");
        shoppingList.addIngredients(Arrays.asList("Tequila", "Triple sec", "Lime juice", "Salt", "Blue Curacao"));

        return shoppingList;
    }
}
