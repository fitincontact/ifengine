package org.fitin;

import org.fitin.ifengine.FirstService;
import org.fitin.ifengine.MyData;
import org.fitin.ifengine.IFengineApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        MyData myData = new MyData();
//
//        System.out.println("Starting IFengineApplication from ifetest...");
//
//        SpringApplication.run(IFengineApplication.class, args);
//    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyData myData = new MyData();
        myData.setId(123L);

        System.out.println("Starting IFengineApplication from ifetest...");

             ConfigurableApplicationContext context = SpringApplication.run(IFengineApplication.class, args);

        FirstService firstService = context.getBean(FirstService.class);
        firstService.setMyData(myData);
    }
}