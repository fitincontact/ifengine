package org.fitin.ifengine.service;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.fitin.ifengine.FirstService;
import org.fitin.ifengine.api.IFEngine;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
//        bind(FirstService.class).in(Singleton.class);
//        bind(SecondService.class).in(Singleton.class);
        bind(IFEngine.class).to(FirstService.class).in(Singleton.class);
    }
}

