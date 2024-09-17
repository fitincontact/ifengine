package org.fitin.ifengine;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class FirstService implements ApplicationRunner {

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("Application started. Type 'exit' to quit.");
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter command: ");
//            String input = scanner.nextLine();
//
//            if ("exit".equalsIgnoreCase(input)) {
//                System.out.println("Exiting...");
//                break; 
//            }
//
//            System.out.println("You entered: " + input);
//        }
//    }

    private MyData myData;

    public void setMyData(MyData myData) {
        this.myData = myData;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application started. Type 'exit' to quit.");
        //System.out.println("Received MyData: " + myData.getId());
        //System.out.println("Received MyData: " + myData);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting...");
            }

            System.out.println("You entered: " + input);
        }
    }
}