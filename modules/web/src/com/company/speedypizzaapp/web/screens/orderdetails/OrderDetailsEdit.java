package com.company.speedypizzaapp.web.screens.orderdetails;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.OrderDetails;

@UiController("speedypizzaapp_OrderDetails.edit")
@UiDescriptor("order-details-edit.xml")
@EditedEntityContainer("orderDetailsDc")
@LoadDataBeforeShow
public class OrderDetailsEdit extends StandardEditor<OrderDetails> {
}