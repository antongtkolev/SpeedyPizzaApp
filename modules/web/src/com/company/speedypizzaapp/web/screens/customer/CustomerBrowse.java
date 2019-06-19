package com.company.speedypizzaapp.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Customer;

@UiController("speedypizzaapp_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}