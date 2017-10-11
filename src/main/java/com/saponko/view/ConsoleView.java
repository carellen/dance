package com.saponko.view;

public class ConsoleView implements View{

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
