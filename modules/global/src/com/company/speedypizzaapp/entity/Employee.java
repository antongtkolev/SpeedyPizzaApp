package com.company.speedypizzaapp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|user")
@Table(name = "SPEEDYPIZZAAPP_EMPLOYEE")
@Entity(name = "speedypizzaapp_Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -9039440714965455532L;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @OneToMany(mappedBy = "employee")
    protected List<Order> order;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}