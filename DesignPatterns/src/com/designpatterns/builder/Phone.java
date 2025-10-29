package com.designpatterns.builder;

public class Phone {
    private String OS;
    private String RAM;
    private int screen;
    private int battery;
    private String camera;

    public Phone(String OS, String RAM, int screen, int battery, String camera) {
        this.OS = OS;
        this.RAM = RAM;
        this.screen = screen;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", RAM='" + RAM + '\'' +
                ", screen=" + screen +
                ", battery=" + battery +
                ", camera='" + camera + '\'' +
                '}';
    }
}
