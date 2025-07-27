package com.example.Store;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Objects;

@Configuration
public class AppConfig {
    @Bean
    public PaymentService gpay(){
        //if....
        return new GPayService();
    }
    @Bean
    public PaypalService paypal(){
        return new PaypalService();
    }
    @Value("${payment.gateway}")
    private String gateway ;

    @Bean
    @Scope("prototype")
    public OrderService orderService(){
        var app = gpay();
        if (Objects.equals(gateway, "gpay")) {
            app = gpay();
        } else if (Objects.equals(gateway, "paypal")) {
            app = paypal();
        }
    return new OrderService(app);
    }
}
