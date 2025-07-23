package com.example.Store;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("paypal")
@Primary
public class PaypalService implements PaymentService {
    @Override
    public void processPayment(){
        System.out.println("Payment Made of Rs.10");

    }
}
