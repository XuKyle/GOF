package com.kylexu.prototypem.java.framework;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
