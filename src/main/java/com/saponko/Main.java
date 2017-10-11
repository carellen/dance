package com.saponko;

import com.saponko.controller.DancerController;
import com.saponko.controller.StreetDancerController;
import com.saponko.service.InputHelper;
import com.saponko.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        DancerController controller = new StreetDancerController(new ConsoleView());
        while(true) {
            controller.showEnterMessage();
            String[] input = null;
            input = InputHelper.getInput();
            if (input == null || input.length == 0 || input[0].equals("")) {
                break;
            }
            controller.setDancer(InputHelper.initializeStreetDancer(input));
            String result = controller.getStepsQuantity();
            if (result != null) {
                controller.showResultMessage(result);
            }
        }
        InputHelper.closeReader();
        controller.showGoodbyeMessage();
    }
}
