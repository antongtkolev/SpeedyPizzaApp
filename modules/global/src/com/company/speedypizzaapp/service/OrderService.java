package com.company.speedypizzaapp.service;

import com.company.speedypizzaapp.entity.Employee;
import com.company.speedypizzaapp.entity.Order;
import com.haulmont.cuba.security.entity.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface OrderService {
    String NAME = "speedypizzaapp_OrderService";


    LocalDateTime getToday();
    BigDecimal getTotal(Order order);
    Employee getEmployee(User user);
    LocalTime getEstimatedTime(Order order);
}