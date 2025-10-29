package com.designpatterns.abstractfactory;

public class Push implements NotificationSystem{
    @Override
    public void Notify() {
        System.out.println("Sending Push Notification");
    }

}
