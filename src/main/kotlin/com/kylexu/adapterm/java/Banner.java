package com.kylexu.adapterm.java;

import java.util.StringJoiner;

public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.println(new StringJoiner("", "(", ")").add(str).toString());
    }

    public void showWithAster() {
        System.out.println(new StringJoiner("", "*", "*").add(str).toString());
    }
}
