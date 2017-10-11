package com.saponko.model;

public class StreetDancer implements Dancer {
    //instead of redundant Field class
    private int[] stepsMap;

    public void setStepsMap(int[] stepsMap) {
        this.stepsMap = stepsMap;
    }

    public int[] getStepsMap() {
        return this.stepsMap;
    }

    //check if current position is inside field
    private boolean isPositionInBoundsOfField(int[] stepsMap, int position) {
        return position >= 0 && position < stepsMap.length;
    }

    private boolean canMove(int[] stepsMap, int position) {
        return stepsMap[position] > 0;
    }

    //return new position of the dancer
    private int moveDancer(int[] stepsMap, int position) {
        return stepsMap[position] % 2 == 0 ? position + stepsMap[position] : position - stepsMap[position];
    }

    private boolean canDoFirstStep(int[] stepsMap) {
        return stepsMap[0] % 2 == 0 && stepsMap[0] < stepsMap.length;
    }

    private boolean isDancerCanStopDance(int[] currentFieldState, int currentPosition) {
        return currentFieldState[currentPosition] == 0;
    }

    //return steps quantity for current dancer
    @Override
    public int getSteps() {
        if (!canDoFirstStep(stepsMap)) {
            return 0;
        }
        int stepCounter = 0;
        int position = 0;
        int lastPosition = 0;
        while (canMove(stepsMap, position)) {
            lastPosition = position;
            position = moveDancer(stepsMap, position);
            if (!isPositionInBoundsOfField(stepsMap, position)) {
                break;
            }
            stepCounter += stepsMap[lastPosition];
            stepsMap[lastPosition] = -1;
        }
        if (!isPositionInBoundsOfField(stepsMap, position)) {
            return stepCounter + lastPosition;
        }
        if (!isDancerCanStopDance(stepsMap, position)) {
            return -1;
        }
        return stepCounter + position;
    }
    @Override
    public boolean initializeField(String[] input) {
        if (input == null || input.length < 2 || input.length > 49) {
            System.out.println("Length of input array must be between 2 and 49");
            return false;
        }
        int[] array = new int[input.length];
        try {
            for (int i = 0; i < input.length; i++) {
                array[i] = Integer.parseInt(input[i]);
            }
            this.stepsMap = array;
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number in input array");
            return false;
        }
    }
}
