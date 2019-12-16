package com.ezgroceries.shoppinglist.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CocktailRepository extends JpaRepository<CocktailEntity, Long> {
    @Override
    List<CocktailEntity> findAllById(Iterable<Long> iterable);
}

/*
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String productName);
}
*/