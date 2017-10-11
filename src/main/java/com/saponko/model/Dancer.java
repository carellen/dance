package com.saponko.model;


public abstract class Dancer  implements StepsCountable{
    protected Field field;

    public abstract Field getField();

    public abstract void setField(Field field);

}