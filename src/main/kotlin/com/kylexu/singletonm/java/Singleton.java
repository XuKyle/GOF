package com.kylexu.singletonm.java;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("making a singleton!");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
