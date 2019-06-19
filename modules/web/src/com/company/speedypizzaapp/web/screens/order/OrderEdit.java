package com.company.speedypizzaapp.web.screens.order;

import com.company.speedypizzaapp.entity.Employee;
import com.company.speedypizzaapp.entity.OrderDetails;
import com.company.speedypizzaapp.service.OrderService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Order;
import com.haulmont.cuba.security.global.UserSession;
import com.haulmont.reports.gui.actions.EditorPrintFormAction;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@UiController("speedypizzaapp_Orders.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
    @Inject
    private TimeField<LocalTime> estimateDeliveryTimeField;
    @Inject
    private OrderService orderService;
    @Inject
    private DateField<LocalDateTime> orderTimeField;
    @Inject
    private UserSession userSession;
    @Inject
    private TextField<BigDecimal> totalAmountField;
    @Inject
    private LookupPickerField<Employee> employeeField;
    @Inject
    private DataManager dataManager;
    @Inject
    private Button printInvoiceBtn;


    @Subscribe
    private void onInit(InitEvent event) {

        printInvoiceBtn.setAction(new EditorPrintFormAction(this,null));

    }

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        if(getEditedEntity().getEmployee()==null){
            getEditedEntity().setEmployee(orderService.getEmployee(userSession.getUser()));
            getEditedEntity().setOrderTime(orderService.getToday());
            orderTimeField.setValue(getEditedEntity().getOrderTime());
            employeeField.setValue(getEditedEntity().getEmployee());
            getEditedEntity().setVersion(1);
        }else{
            getEditedEntity().setVersion(getEditedEntity().getVersion()+1);
        }
    }

    @Subscribe(id = "orderDetailsDc", target = Target.DATA_CONTAINER)
    private void onDishesDcCollectionChange(CollectionContainer.CollectionChangeEvent<OrderDetails> event) {
        if (event.getChangeType() != CollectionChangeType.REFRESH) {
            getEditedEntity().setTotalAmount(orderService.getTotal(getEditedEntity()));
            getEditedEntity().setEstimateDeliveryTime(orderService.getEstimatedTime(getEditedEntity()));
            totalAmountField.setValue(getEditedEntity().getTotalAmount());
            estimateDeliveryTimeField.setValue(getEditedEntity().getEstimateDeliveryTime());
        }
    }
    @Subscribe
    private void onBeforeCommitChanges(BeforeCommitChangesEvent event) {

        if (getEditedEntity().getVersion()==1) {
            getEditedEntity().getCustomer().setOrderCounter(getEditedEntity().getCustomer().getOrderCounter() + 1);
        }
    }
}