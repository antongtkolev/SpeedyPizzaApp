package com.company.speedypizzaapp.web.screens.ingredients;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Ingredients;

@UiController("speedypizzaapp_Ingredients.browse")
@UiDescriptor("ingredients-browse.xml")
@LookupComponent("ingredientsesTable")
@LoadDataBeforeShow
public class IngredientsBrowse extends StandardLookup<Ingredients> {
}