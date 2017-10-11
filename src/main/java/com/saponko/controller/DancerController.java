package com.saponko.controller;

import com.saponko.model.Dancer;

public interface DancerController {
    void setDancer(Dancer dancer);

    void showEnterMessage();

    void showGoodbyeMessage();

    void showResultMessage(String result);

    String getStepsQuantity();
}
