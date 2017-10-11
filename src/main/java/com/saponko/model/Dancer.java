package com.saponko.model;

public class Dancer {
    private Field field;
    private boolean isFinished;

    public Dancer(Field field) {
        this.field = field;
        this.isFinished = false;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
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
    public int getSteps(int[] stepsMap) {
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
}
