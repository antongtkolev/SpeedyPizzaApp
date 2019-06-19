package com.company.speedypizzaapp.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Customer;

@UiController("speedypizzaapp_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}