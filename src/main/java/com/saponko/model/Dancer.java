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
    private boolean checkPosition(int position) {
        return position >= 0 && position < field.getLength();
    }

    private boolean canMove(int[] stepsMap, int position) {
        if (stepsMap[position] > 0) {
            return true;
        } else {
            isFinished = true;
            return false;
        }
    }
    //return new position of the dancer
    private int moveDancer(int[] stepsMap, int position) {
        return stepsMap[position] % 2 == 0 ? position + stepsMap[position] : position - stepsMap[position];
    }
    //return steps quantity for current dancer
    public int getSteps() {
        int[] input = field.getStepList();
        int result = 0;
        int position = 0;
        int currentPosition = 0;
        if (input[position] % 2 == 0 && input[position] < input.length) {
            while (canMove(input, position)) {
                currentPosition = position;
                position = moveDancer(input, position);
                if (checkPosition(position)) {
                    result += input[currentPosition];
                } else {
                    break;
                }
                input[currentPosition] = -1;
            }
            if (checkPosition(position)) {
                if (input[position] == 0 ) {
                    return result + position;
                } else {
                    return -1;
                }
            } else {
                return result + currentPosition;
            }
        } else {
            return 0;
        }
    }
}
