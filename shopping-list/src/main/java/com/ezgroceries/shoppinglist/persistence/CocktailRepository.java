package com.ezgroceries.shoppinglist.persistence;


import org.springframework.data.repository.Repository;

import java.util.BitSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface CocktailRepository extends Repository<CocktailEntity, UUID> {

    public CocktailEntity save(CocktailEntity newCocktailEntity);

    public Set<CocktailEntity> findByIdDrinkIn(List<String> ids);
}