package com.designpatterns.abstractfactory;

public class SMS implements NotificationSystem{

    /**
     *
     */
    @Override
    public void Notify() {
        System.out.println("Sending SMS Notification");
    }


}
