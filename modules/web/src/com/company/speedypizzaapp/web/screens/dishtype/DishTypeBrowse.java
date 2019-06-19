package com.company.speedypizzaapp.web.screens.dishtype;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.DishType;

@UiController("speedypizzaapp_DishType.browse")
@UiDescriptor("dish-type-browse.xml")
@LookupComponent("dishTypesTable")
@LoadDataBeforeShow
public class DishTypeBrowse extends StandardLookup<DishType> {
}