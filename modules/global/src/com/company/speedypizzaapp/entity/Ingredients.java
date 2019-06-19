package com.company.speedypizzaapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "SPEEDYPIZZAAPP_INGREDIENTS")
@Entity(name = "speedypizzaapp_Ingredients")
public class Ingredients extends StandardEntity {
    private static final long serialVersionUID = 4115604168831945393L;

    @Column(name = "NAME", length = 100)
    protected String name;

    @JoinTable(name = "SPEEDYPIZZAAPP_INGREDIENTS_DISH_LINK",
            joinColumns = @JoinColumn(name = "INGREDIENTS_ID"),
            inverseJoinColumns = @JoinColumn(name = "DISH_ID"))
    @ManyToMany
    protected List<Dish> dish;

    public List<Dish> getDish() {
        return dish;
    }

    public void setDish(List<Dish> dish) {
        this.dish = dish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}