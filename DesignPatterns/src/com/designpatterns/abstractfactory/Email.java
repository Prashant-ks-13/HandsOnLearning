package com.designpatterns.abstractfactory;

public class Email implements NotificationSystem{
    @Override
    public void Notify() {
        System.out.println("Sending Email Notification");
    }


}
