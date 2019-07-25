package com.kylexu.templatemethod.java;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('H');
        AbstractDisplay sd1 = new StringDisplay("Hello,World");
        AbstractDisplay sd2 = new StringDisplay("您好，中国");

        display.display();
        sd1.display();
        sd2.display();
    }
}
