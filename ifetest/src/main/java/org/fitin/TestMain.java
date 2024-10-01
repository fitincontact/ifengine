package org.fitin;

import org.fitin.ifengine.api.IFEngine;
import org.fitin.ifengine.config.AppModule;
import org.fitin.ifengine.model.Player;

import static com.google.inject.Guice.createInjector;

public class TestMain {
    static IFEngine IFE = createInjector(new AppModule()).getInstance(IFEngine.class);

    public static void main(String[] args) {
        Player player = IFE.getPlayer("John Abigail");
        IFE.start();
    }

}
