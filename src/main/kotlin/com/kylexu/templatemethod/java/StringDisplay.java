package com.kylexu.templatemethod.java;

public class StringDisplay extends AbstractDisplay {
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    @Override
    void open() {
        printLine();
    }

    @Override
    void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
