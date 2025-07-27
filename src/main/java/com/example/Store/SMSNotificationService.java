package com.example.Store;

import org.springframework.stereotype.Service;

@Service("sms")

public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message,String email){
        System.out.println("Sending SMS: "+message);
    }
}
