package com.company.speedypizzaapp.web.screens.dishtype;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.DishType;

@UiController("speedypizzaapp_DishType.edit")
@UiDescriptor("dish-type-edit.xml")
@EditedEntityContainer("dishTypeDc")
@LoadDataBeforeShow
public class DishTypeEdit extends StandardEditor<DishType> {
}