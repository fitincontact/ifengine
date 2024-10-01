package org.fitin.ifengine.config;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.fitin.ifengine.api.IFEngine;
import org.fitin.ifengine.service.FirstService;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IFEngine.class).to(FirstService.class).in(Singleton.class);
    }
}

