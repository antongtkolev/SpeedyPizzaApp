package com.company.speedypizzaapp.web.screens.ingredients;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Ingredients;

@UiController("speedypizzaapp_Ingredients.edit")
@UiDescriptor("ingredients-edit.xml")
@EditedEntityContainer("ingredientsDc")
@LoadDataBeforeShow
public class IngredientsEdit extends StandardEditor<Ingredients> {
}