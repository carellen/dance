package com.saponko.service;

import com.saponko.model.Dancer;
import com.saponko.model.Field;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Service {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String[] getInput() {
        BufferedReader reader = Service.reader;
        try {
            String[] input = reader.readLine().split(" ");
            return input;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Dancer initializeDancer(String[] stepsMap) {
        Field field = Field.getInstance(stepsMap);
        if (field == null) {
            return null;
        }
        return new Dancer(field);
    }

    public static void closeReader() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
