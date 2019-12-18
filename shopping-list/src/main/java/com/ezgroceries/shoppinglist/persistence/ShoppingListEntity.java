package com.ezgroceries.shoppinglist.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "shoppinglist")
public class ShoppingListEntity {

    @Id
    @Column(name="id")
    private UUID id;

    @Column(name="name")
    private String name;
/*
    @Column(name="ingredients")
    private List<String> ingredients;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 */
}
