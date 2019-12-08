package contract;

import model.CocktailResource;

import java.util.List;
import java.util.UUID;

public class CocktailsInput {
    CocktailResource cocktail;

    public CocktailsInput() {

    }

    public void setCocktail(CocktailResource cocktail) {
        this.cocktail = cocktail;
    }

    public CocktailResource getCocktail() {
        return this.cocktail;
    }
}
