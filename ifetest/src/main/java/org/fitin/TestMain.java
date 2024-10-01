package org.fitin;

import org.fitin.ifengine.api.IFEngine;
import org.fitin.ifengine.config.AppModule;
import org.fitin.ifengine.model.Player;

import static com.google.inject.Guice.createInjector;

public class TestMain {
    static IFEngine ife = createInjector(new AppModule()).getInstance(IFEngine.class);

    public static void main(String[] args) {
        Player myData = ife.getPlayer();
        myData.setId(345634L);
        ife.start();
    }

}
