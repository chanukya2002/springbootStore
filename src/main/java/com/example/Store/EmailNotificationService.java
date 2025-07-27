package com.example.Store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {
    @Value("${mail.host}")
    private String host;
    @Value("${mail.port}")
    private int port;

    @Override
    public void send(String message, String email){
        System.out.println("Sending Email to "+email);
        System.out.println("Message:"+message);
        System.out.println("Host: "+host);
        System.out.println("Port:"+port);
    }
}
