package com.saponko;

import com.saponko.controller.DancerController;
import com.saponko.controller.DancerControllerImpl;
import com.saponko.model.Dancer;
import com.saponko.model.StreetDancer;
import com.saponko.service.InputHelper;
import com.saponko.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        DancerController controller = new DancerControllerImpl(new ConsoleView());
        while (true) {
            controller.showEnterMessage();
            String[] input = null;
            input = InputHelper.getInput();
            if (input == null || input.length == 0 || input[0].equals("")) {
                break;
            }
            Dancer dancer = new StreetDancer();
            if (dancer.initializeField(input)) {
                controller.setDancer(dancer);
                String result = controller.getStepsQuantity();
                controller.showResultMessage(result);
            }
        }
        InputHelper.closeReader();
        controller.showGoodbyeMessage();
    }
}
