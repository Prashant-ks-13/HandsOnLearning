package com.designpatterns.factory;

public class OsFactory {
    public OS getInstance(String str){
        if (str.equals("Android")){
            return new Android();
        }else {
            return new IOS();
        }
    }
}
