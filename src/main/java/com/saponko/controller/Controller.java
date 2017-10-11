package com.saponko.controller;

import com.saponko.model.Dancer;
import com.saponko.service.Service;
import com.saponko.view.View;

public class Controller {
    private Dancer dancer;
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void letsDance() {
        while(true) {
            view.showEnterMessage();
            String[] input = null;
            input = Service.getInput();
            if (input == null || input.length == 0 || input[0].equals("")) {
                break;
            }
            dancer = Service.initializeDancer(input);
            if (dancer != null) {
                int result = dancer.getSteps();
                view.showResultMessage(result);
            }
        }
        Service.closeReader();
        view.showGoodbyeMessage();
    }
}
