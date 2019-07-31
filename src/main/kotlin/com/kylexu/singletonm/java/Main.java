package com.kylexu.singletonm.java;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("same obj!");
        } else {
            System.out.println("not same obj!");
        }
    }
}
