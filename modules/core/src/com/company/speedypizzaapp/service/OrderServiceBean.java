package com.company.speedypizzaapp.service;

import com.company.speedypizzaapp.entity.Employee;
import com.company.speedypizzaapp.entity.Order;
import com.company.speedypizzaapp.entity.OrderDetails;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FluentLoader;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service(OrderService.NAME)
public class OrderServiceBean implements OrderService {
    @Inject
    private DataManager dataManager;
    @Override
    public LocalDateTime getToday() {
        return LocalDateTime.now();
    }
    @Override
    public BigDecimal getTotal(Order order) {
        BigDecimal total=new BigDecimal(0);
        long count=0;
        for(OrderDetails d:order.getOrderDetails()){
            total=total.add(d.getDish().getPrice().multiply(BigDecimal.valueOf(d.getCount())));
            count+=d.getCount();
        }

        if(count>=3){
            if(count>=10){
                total=total.multiply(BigDecimal.valueOf(0.9));
            }else{
                total=total.multiply(BigDecimal.valueOf(0.95));
            }
        }
        if(order.getCustomer().getOrderCounter()>=50){
            if(order.getCustomer().getOrderCounter()>=100){
                total=total.multiply(BigDecimal.valueOf(0.8));
            }else {
                total=total.multiply(BigDecimal.valueOf(0.85));
            }
        }
        return total;
    }
    @Override
    public Employee getEmployee(User user) {
        FluentLoader.ByQuery<Employee, UUID> query = dataManager.load(Employee.class)
                .view("employee-full-view")
                .query("select v from speedypizzaapp_Employee v where v.user = :user");
        Map<String, Object> params = new HashMap<>();
        params.put("user", user);
        query.setParameters(params);
        return query.one();
    }
    @Override
    public LocalTime getEstimatedTime(Order order) {

        LocalTime time=order.getOrderTime().toLocalTime();
        time=time.plusMinutes(10);
        for(OrderDetails di:order.getOrderDetails()){
            time=time.plusHours(di.getDish().getPrepTime().getHour()*di.getCount());
            time=time.plusMinutes(di.getDish().getPrepTime().getMinute()*di.getCount());
            if(di.getCount()>3){
                time=time.minusMinutes(di.getDish().getPrepTime().getMinute());
            }
        }
        return time;
    }
}