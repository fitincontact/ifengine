package org.fitin.ifengine.service;

import com.google.inject.Singleton;
import org.fitin.ifengine.model.Info;

import java.util.Scanner;

import static org.fitin.ifengine.model.Game.GAME;

@Singleton
public class MainService {
    public void start(Info info) {
        //todo validate before all

        System.out.println("Application started. Type 'exit' to quit.");
        System.out.println("Received MyData: " + GAME.getPlayers().get(0).getWord());

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
