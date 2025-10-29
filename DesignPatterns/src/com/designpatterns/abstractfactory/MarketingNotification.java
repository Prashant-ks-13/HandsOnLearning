package com.designpatterns.abstractfactory;

public class MarketingNotification implements NotificationFactory{
    /**
     * @param str
     * @return
     */
    @Override
    public NotificationSystem sendNotification(String str) {
        if (str.equals("SMS")){
            return new SMS();
        } else if (str.equals("Email")) {
            return new Email();
        }else {
            return new Push();
        }

    }

    /**
     * @param str
     * @return
     */
    @Override
    public Buzz sendBuzz(String str) {
        if (str.equals("Mobile")){
            return new MobileBuzz();
        }else {
            return new WebBuzz();
        }
    }
}
