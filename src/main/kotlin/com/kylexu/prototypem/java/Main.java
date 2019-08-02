package com.kylexu.prototypem.java;

import com.kylexu.prototypem.java.framework.Manager;
import com.kylexu.prototypem.java.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderLinePen underLinePen = new UnderLinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('/');

        manager.register("strong msg", underLinePen);
        manager.register("warning msg", messageBox);
        manager.register("slash msg", messageBox1);

        Product productU = manager.create("strong msg");
        Product productM = manager.create("warning msg");
        Product productM2 = manager.create("slash msg");

        productU.use("Hello World");
        productM.use("Hello World");
        productM2.use("Hello World");
    }
}
