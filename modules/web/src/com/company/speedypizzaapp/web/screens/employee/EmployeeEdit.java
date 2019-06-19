package com.company.speedypizzaapp.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Employee;

@UiController("speedypizzaapp_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}