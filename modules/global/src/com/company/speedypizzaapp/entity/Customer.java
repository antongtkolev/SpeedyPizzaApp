package com.company.speedypizzaapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "SPEEDYPIZZAAPP_CUSTOMER")
@Entity(name = "speedypizzaapp_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 6375019176591415818L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "CUSTOMER_ADRESS", nullable = false)
    protected String customerAdress;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true, length = 20)
    protected String phoneNumber;

    @NotNull
    @Column(name = "ORDER_COUNTER", nullable = false)
    protected Integer orderCounter;

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public Integer getOrderCounter() {
        return orderCounter;
    }

    public void setOrderCounter(Integer orderCounter) {
        this.orderCounter = orderCounter;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}