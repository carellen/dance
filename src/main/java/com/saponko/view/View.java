package com.saponko.view;

public class View {
    public void showEnterMessage() {
        System.out.println("Please, input array of numbers. Use space as delimiter. To quit press enter.");
    }

    public void showGoodbyeMessage() {
        System.out.println("Goodbye! Will glad to see you again!");
    }

    public void showResultMessage(int result) {
        System.out.format("Dancer will perform %d steps.\r\n\r\n", result);
    }
}
