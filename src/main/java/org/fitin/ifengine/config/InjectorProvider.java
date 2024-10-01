package org.fitin.ifengine.config;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class InjectorProvider {
    private static final Injector injector = Guice.createInjector(new AppModule());

    public static Injector getInjector() {
        return injector;
    }

    public static <T> T getInstance(Class<T> classs) {
        return injector.getInstance(classs);
    }
}

