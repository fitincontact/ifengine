package org.fitin.ifengine.service.config;

import com.google.inject.Injector;
import org.fitin.ifengine.config.InjectorProvider;
import org.fitin.ifengine.model.Player;
import org.fitin.ifengine.service.IFEngineImpl;


public class SymbolMapServiceTest {
    public static void main(String[] args) {
        Injector injector = InjectorProvider.getInjector();
        IFEngineImpl IFEngineImpl = injector.getInstance(IFEngineImpl.class);
        Player player = IFEngineImpl.getPlayer("John Abigail");
        IFEngineImpl.start();
    }
}

