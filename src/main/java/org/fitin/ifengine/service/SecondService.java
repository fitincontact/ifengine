package org.fitin.ifengine.service;

import com.google.inject.Singleton;
import org.fitin.ifengine.model.Player;

import java.util.Scanner;

@Singleton
public class SecondService {
    public void run(Player player) {
        System.out.println("Application started. Type 'exit' to quit.");
        System.out.println("Received MyData: " + player.getId());

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
