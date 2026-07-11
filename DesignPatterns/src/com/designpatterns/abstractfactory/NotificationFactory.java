package com.designpatterns.abstractfactory;

public interface NotificationFactory {
    public NotificationSystem sendNotification(String str);
    public Buzz sendBuzz(String str);
}
