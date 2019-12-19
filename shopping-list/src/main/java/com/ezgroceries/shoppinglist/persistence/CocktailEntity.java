package com.ezgroceries.shoppinglist.persistence;

import com.ezgroceries.shoppinglist.StringSetConverter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "cocktail")
public class CocktailEntity {

    @Id
    @Column(name="id")
    private UUID cocktailId;

    @Column(name="id_drink")
    private String idDrink;

    @Column(name="name")
    private String name;

    @Convert(converter = StringSetConverter.class)
    @Column(name="ingredients")
    private Set<String> ingredients;

    public void setId(UUID id) {
        this.cocktailId = id;
    }

    public UUID getId() {
        return cocktailId;
    }

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getIdDrink() {
        return this.idDrink;
    }

    public void setName(String name) {
        this.name = name;
    }
}