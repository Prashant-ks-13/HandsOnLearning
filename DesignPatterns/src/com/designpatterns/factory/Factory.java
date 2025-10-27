package com.designpatterns.factory;

public class Factory {
    public static void main(String[] args) {
        OsFactory osFactory = new OsFactory();
        OS obj = osFactory.getInstance("IO");
        obj.specs();

    }
}
