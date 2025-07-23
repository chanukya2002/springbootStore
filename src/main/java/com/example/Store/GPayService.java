package com.example.Store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
@Service("gpay")


public class GPayService implements PaymentService{
    @Value("${gpay.apiUrl}")
    private String apiUrl;
    @Value("${gpay.enabled}")
    private boolean enabled;

    @Value("${gpay.timeout:3000}")
    private int timeout;
    @Value("${gpay.supportedCurrencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Amount: ");
//        int amount = sc.nextInt();
        System.out.println("Api URL : "+ apiUrl);
        System.out.println("Enabled : "+enabled);
        System.out.println("TimeOut: "+timeout);
        System.out.println("Supported Currencies are : "+supportedCurrencies);
        int amount = 10;
        System.out.println("Payment made using GPAy of Rs."+ amount);
    }
}
