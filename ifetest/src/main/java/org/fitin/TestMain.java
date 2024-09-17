package org.fitin;

import org.fitin.ifengine.MyData;
import org.fitin.ifengine.IFengineApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        MyData myData = new MyData();
        myData.setId(123L);

        System.out.println("Starting IFengineApplication from ifetest...");

        SpringApplication app = new SpringApplication(IFengineApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyData.class, () -> myData);
        });

        ConfigurableApplicationContext context = app.run(args);
    }
}