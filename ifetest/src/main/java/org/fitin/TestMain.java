package org.fitin;

import org.fitin.ifengine.FirstService;
import org.fitin.ifengine.MyData;
import org.fitin.ifengine.api.IFEngine;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.fitin.ifengine.service.AppModule;

public class TestMain {
    public static void main(String[] args) {
        //run11();
        run3();
    }

    static void run11() {
        FirstService firstService = new FirstService();
        MyData myData = firstService.getMayData();
        myData.setId(123L);
        firstService.start();
    }


    static void run3() {
        Injector injector = Guice.createInjector(new AppModule());
        IFEngine ifEngine = injector.getInstance(IFEngine.class);
        MyData myData = ifEngine.getMayData();
        myData.setId(345634L);
        ifEngine.start();
    }
}
