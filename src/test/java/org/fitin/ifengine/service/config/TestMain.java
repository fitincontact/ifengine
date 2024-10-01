package org.fitin.ifengine.service.config;

import com.google.inject.Injector;
import org.fitin.ifengine.model.Player;
import org.fitin.ifengine.config.InjectorProvider;
import org.fitin.ifengine.service.FirstService;


public class TestMain {
    public static void main(String[] args) {
        Injector injector = InjectorProvider.getInjector();
        FirstService firstService = injector.getInstance(FirstService.class);
        Player player = firstService.getPlayer();
        firstService.start();
    }
}

