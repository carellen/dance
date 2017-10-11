package com.saponko.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String[] getInput() {
        BufferedReader reader = InputHelper.reader;
        try {
            String[] input = reader.readLine().split(" ");
            return input;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeReader() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
