package com.saponko;

import com.saponko.controller.DancerController;
import com.saponko.controller.StreetDancerController;
import com.saponko.service.StreetDancerService;
import com.saponko.view.ConsoleView;
import com.saponko.view.View;

public class Main {

    public static void main(String[] args) {
        DancerController controller = new StreetDancerController(new ConsoleView());
        while(true) {
            controller.showEnterMessage();
            String[] input = null;
            input = StreetDancerService.getInput();
            if (input == null || input.length == 0 || input[0].equals("")) {
                break;
            }
            controller.setDancer(StreetDancerService.initializeStreetDancer(input));
            String result = controller.getStepsQuantity();
            if (result != null) {
                controller.showResultMessage(result);
            }
        }
        StreetDancerService.closeReader();
        controller.showGoodbyeMessage();
    }
}
