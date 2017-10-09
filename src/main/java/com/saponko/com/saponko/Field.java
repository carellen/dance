package com.saponko.com.saponko;

public class Field {

    private int length;
    private int[] stepList;

    private Field(int[] stepList) {
        this.length = stepList.length;
        this.stepList = stepList;
    }

    public int getLength() {
        return length;
    }

    public int[] getStepList() {
        return stepList;
    }

    public static Field getInstance(String[] input) {
        if (input == null || input.length < 2 || input.length > 49) {
            System.out.println("Length of input array must be between 2 and 49");
            return null;
        }
        int[] array = new int[input.length];
        try {
            for (int i = 0; i < input.length; i++) {
                array[i] = Integer.parseInt(input[i]);
            }
            return new Field(array);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number in input array");
            return null;
        }
    }
}
