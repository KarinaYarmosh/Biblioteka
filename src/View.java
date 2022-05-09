import javax.swing.*;

import java.util.Scanner;

public class View{
    private Controller controller;

    public View(Controller controller){
        this.controller = controller;
    }

    Scanner in = new Scanner(System.in);

    public void init() {

    System.out.println("Poprosze pin:");

    int pin=0;
        while (pin != 4444) {
                try {
                    int pin2 = in.nextInt();
                    System.out.println("Got it " + pin2 + ". Waiting...");
                    int finalPin = pin2;
                    pin = pin2;
                    Thread thread = new Thread(() -> {
                        boolean result;
                        result = controller.checkPin(finalPin);
                        String resultMessage;
                        if(result) {
                            resultMessage = "Right pin";
                            System.out.println("Got it " + resultMessage);
                        }
                        else {
                            resultMessage = "Wrong, try again";
                            System.out.println("Got it " + resultMessage);
                        }
                    });
                    thread.start();
                } catch (NumberFormatException e2) {
                    System.out.println("Only numbers, pls");
                }
        }
    }
}


