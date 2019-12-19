package com.ezgroceries.shoppinglist.controllers;

import com.ezgroceries.shoppinglist.services.CocktailService;
import com.ezgroceries.shoppinglist.services.CocktailDBClient;
import com.ezgroceries.shoppinglist.services.CocktailDBResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cocktails", produces = "application/json")
public class CocktailController {

    @Autowired
    private CocktailDBClient cocktailDBClient;

    @Autowired
    private CocktailService cocktailService;

    @GetMapping
    public List<CocktailResource> get(@RequestParam String search) {
        CocktailDBResponse cocktailDBResponse = cocktailDBClient.searchCocktails(search);

        return cocktailService.mergeCocktails(cocktailDBResponse.getDrinks());
    }
}
