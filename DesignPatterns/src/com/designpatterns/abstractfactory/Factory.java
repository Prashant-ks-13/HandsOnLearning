package com.designpatterns.abstractfactory;

public class Factory {
    public static void main(String[] args) {
        NotificationFactory nf = new PaymentNotification();
        nf.sendNotification("SMS").Notify();
        nf.sendBuzz("WEB").buzz();
        NotificationFactory nf1 = new MarketingNotification();
        nf1.sendNotification("Email").Notify();
        nf1.sendBuzz("Mobile").buzz();
    }
}
