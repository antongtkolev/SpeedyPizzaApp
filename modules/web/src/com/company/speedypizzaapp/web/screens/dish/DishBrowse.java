package com.company.speedypizzaapp.web.screens.dish;


import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Dish;

@UiController("speedypizzaapp_Dish.browse")
@UiDescriptor("dish-browse.xml")
@LookupComponent("dishesTable")
@LoadDataBeforeShow
public class DishBrowse extends StandardLookup<Dish> {
}