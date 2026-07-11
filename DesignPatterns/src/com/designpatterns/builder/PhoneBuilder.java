package com.designpatterns.builder;

public class PhoneBuilder {
    private String OS;
    private String RAM;
    private int screen;
    private int battery;
    private String camera;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public PhoneBuilder setScreen(int screen) {
        this.screen = screen;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public Phone getPhone(){
        return new Phone(OS,RAM,screen,battery,camera);
    }
}
