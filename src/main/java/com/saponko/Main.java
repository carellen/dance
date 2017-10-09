package com.saponko;

import com.saponko.controller.Controller;
import com.saponko.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.letsDance();
    }
}
