package org.fitin.ifengine;

import com.google.inject.Singleton;

import java.util.Scanner;

@Singleton
public class SecondService {
    public void run(MyData myData) {
        System.out.println("Application started. Type 'exit' to quit.");
        System.out.println("Received MyData: " + myData.getId());

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
