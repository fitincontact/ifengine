package org.fitin.ifengine;

import java.util.Scanner;

public class FirstService {

    private MyData myData;

    public FirstService(MyData myData) {
        this.myData = myData;
    }

    public void run() {
        System.out.println("Application started. Type 'exit' to quit.");
        System.out.println("Received MyData: " + this.myData.getId());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("You entered: " + input);
        }
    }
}
