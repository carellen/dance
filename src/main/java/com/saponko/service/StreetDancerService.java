package com.saponko.service;

import com.saponko.model.StreetDancer;
import com.saponko.model.StreetField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetDancerService {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String[] getInput() {
        BufferedReader reader = StreetDancerService.reader;
        try {
            String[] input = reader.readLine().split(" ");
            return input;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static StreetDancer initializeStreetDancer(String[] stepsMap) {
        StreetField field = new StreetField();
        int[] input = field.initializeField(stepsMap);
        field.setStepsMap(input);
        if (field.getStepsMap() == null) {
            return null;
        }
        StreetDancer dancer = new StreetDancer();
        dancer.setField(field);
        return dancer;
    }

    public static void closeReader() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
