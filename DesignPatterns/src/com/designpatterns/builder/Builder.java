package com.designpatterns.builder;

public class Builder {
    public static void main(String[] args) {
        Phone ph = new PhoneBuilder().setOS("Quallcomm").setBattery(5000).setRAM("12GB").getPhone();
        System.out.println(ph.toString());
    }
}
