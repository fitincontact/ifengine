package org.fitin.ifengine.service.config;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Singleton
public class SymbolBindUser {
    private final Map<Symbol, String> map = new HashMap<>();

    @Inject
    public SymbolBindUser() {
    }
}
