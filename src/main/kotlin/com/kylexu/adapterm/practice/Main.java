package com.kylexu.adapterm.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");

            String year = fileIO.getValue("year");
            System.out.println("year = " + year);

            fileIO.setValue("year-new", "2019");
            fileIO.setValue("month", "july");

            fileIO.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
