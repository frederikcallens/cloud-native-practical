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

    @Column(name="name")
    private String name;

    @Column(name="glass")
    private String glass;

    @Column(name="instructions")
    private String instructions;

    @Column(name="image")
    private String image;

    @Convert(converter = StringSetConverter.class)
    @Column(name="ingredients")
    private Set<String> ingredients;

    public void setId(UUID randomUUID) {
    }
}