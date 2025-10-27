package com.designpatterns.singleton;

public class Singleton {
    private static volatile Singleton instance;
    static int cnt =0;

    private Singleton(){
        System.out.println("Instance is Created");
    }


    public static Singleton getInstance(){

//    public static synchronized Singleton getInstance(){
//        if(instance==null){
//            instance = new Singleton();
//            System.out.println("Instance is Instantiated");
//        }
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                    System.out.println("Instance is Instantiated");
                }
            }
        }
        cnt++;


        System.out.println("Returning the same instance " +cnt);
        return instance;
    }
}
class Main {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.getInstance();
        singleton.getInstance();
        singleton.getInstance();
        singleton.getInstance();
    }
}
