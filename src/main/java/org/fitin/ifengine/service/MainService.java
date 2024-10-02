package org.fitin.ifengine.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.Scanner;

import static org.fitin.ifengine.util.Print.p;
import static org.fitin.ifengine.util.Print.pl;

@Singleton
public class MainService {
    private final StartConsoleService startConsoleService;

    @Inject
    public MainService(StartConsoleService startConsoleService) {
        this.startConsoleService = startConsoleService;
    }

    public void start() {
        //todo validate before all
        startConsoleService.exec();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            p("Enter command: ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                pl("Exiting...");
                break;
            }

            pl("You entered: " + input);
        }
    }
}
