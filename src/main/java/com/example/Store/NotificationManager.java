package com.example.Store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private NotificationService notificationService;
    public NotificationManager( NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public void sendNotification(String message,String email){
        notificationService.send(message,email);
    }
}
