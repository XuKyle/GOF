package com.kylexu.adapterm.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        properties.load(new FileInputStream(new File(fileName)));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        properties.store(new FileOutputStream(fileName), "");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
