package com.kylexu.prototypem.java.framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showCases = new HashMap<>();

    public void register(String name, Product product) {
        showCases.put(name, product);
    }

    public Product create(String protoName) {
        Product product = showCases.get(protoName);
        return product.createClone();
    }
}
