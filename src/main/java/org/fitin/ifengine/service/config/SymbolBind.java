package org.fitin.ifengine.service.config;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import lombok.Getter;

import java.util.Map;

import static java.util.Map.entry;
import static org.fitin.ifengine.service.config.Symbol.*;

@Getter
@Singleton
public class SymbolBind {
    private final String separator = System.lineSeparator();
    private final Map<Symbol, String> map = Map.ofEntries(
            entry(SC_G_HEAD_SS, ""),
            entry(SC_G_HEAD_FS, ""),
            entry(SC_G_HEAD_SE, separator),

            entry(SC_G_NAME_SS, ":"),
            entry(SC_G_NAME_FS, ""),
            entry(SC_G_NAME_SE, separator),

            entry(SC_G_DESC_SS, ":"),
            entry(SC_G_DESC_FS, ""),
            entry(SC_G_DESC_SE, separator),

            entry(SC_MENU_SS, ":"),
            entry(SC_MENU_FS, ""),
            entry(SC_MENU_SE, separator),
            entry(SC_MENU_DE, "Press 'Enter' to start; l. for load, e. or q. for exit")

    );

    @Inject
    public SymbolBind() {
    }


}
