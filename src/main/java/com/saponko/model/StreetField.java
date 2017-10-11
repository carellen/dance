package com.saponko.model;

public class StreetField implements Field{

    private int[] stepsMap;

    public int[] getStepsMap() {
        return stepsMap;
    }

    public void setStepsMap(int[] stepsMap) {
        this.stepsMap = stepsMap;
    }

    @Override
    public int[] initializeField(String[] input) {
        if (input == null || input.length < 2 || input.length > 49) {
            System.out.println("Length of input array must be between 2 and 49");
            return null;
        }
        int[] array = new int[input.length];
        try {
            for (int i = 0; i < input.length; i++) {
                array[i] = Integer.parseInt(input[i]);
            }
            return array;
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number in input array");
            return null;
        }
    }
}