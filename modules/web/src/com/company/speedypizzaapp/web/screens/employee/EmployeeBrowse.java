package com.company.speedypizzaapp.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizzaapp.entity.Employee;

@UiController("speedypizzaapp_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}