package com.example.Store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        System.out.println("Order Service Created");
        this.paymentService = paymentService ;
    }
    public void placeOrder(){
        System.out.println("Order Placed");
        paymentService.processPayment();
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
