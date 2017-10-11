package com.saponko.controller;

import com.saponko.model.Dancer;
import com.saponko.view.View;

import java.util.ResourceBundle;

public class DancerControllerImpl implements DancerController {

    private Dancer dancer;
    private View view;
    private final static ResourceBundle BUNDLE = ResourceBundle.getBundle("messages");

    public DancerControllerImpl(View view) {
        this.view = view;
    }

    @Override
    public void setDancer(Dancer dancer) {
        this.dancer = dancer;
    }

    @Override
    public void showEnterMessage(){
        view.showMessage(BUNDLE.getString("hello"));
    }
    @Override
    public void showGoodbyeMessage(){
        view.showMessage(BUNDLE.getString("goodbye"));
    }

    @Override
    public void showResultMessage(String result){
        view.showMessage(String.format(BUNDLE.getString("result") + "\r\n\r\n", result));
    }

    @Override
    public String getStepsQuantity() {
        return String.valueOf(dancer.getSteps());
    }
}
