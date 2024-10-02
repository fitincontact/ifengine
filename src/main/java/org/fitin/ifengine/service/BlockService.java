package org.fitin.ifengine.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.fitin.ifengine.model.Game;
import org.fitin.ifengine.service.config.Symbol;
import org.fitin.ifengine.service.config.SymbolBind;
import org.fitin.ifengine.service.config.SymbolBindUser;

import java.util.HashMap;
import java.util.Map;

import static org.fitin.ifengine.service.config.Symbol.*;

@Singleton
public class BlockService {
    private final Game game;
    private final SymbolBind symbolBind;
    private final Map<Symbol, String> map = new HashMap<>();

    //todo api
    @Inject
    public BlockService(Game game,
                        SymbolBind symbolBind,
                        SymbolBindUser symbolBindUser) {
        this.game = game;
        this.symbolBind = symbolBind;
        this.map.putAll(symbolBind.getMap());
        this.map.putAll(symbolBindUser.getMap());
    }

    private String getGameHead() {
        final String gameHead = game.getInfo().getGameHead();
        final StringBuilder builder = new StringBuilder();
        if (!gameHead.isEmpty()) {
            builder
                    .append(map.get(SC_G_HEAD_SS))
                    .append(gameHead)
                    .append(map.get(SC_G_HEAD_FS))
                    .append(map.get(SC_G_HEAD_SE));
        }
        return builder.toString();
    }

    private String getGameName() {
        final String gameName = game.getInfo().getGameName();
        final StringBuilder builder = new StringBuilder();
        if (!gameName.isEmpty()) {
            builder
                    .append(map.get(SC_G_NAME_SS))
                    .append(gameName)
                    .append(map.get(SC_G_NAME_FS))
                    .append(map.get(SC_G_NAME_SE));
        }
        return builder.toString();
    }

    private String getGameDescription() {
        final String gameDescription = game.getInfo().getGameDescription();
        final StringBuilder builder = new StringBuilder();
        if (!gameDescription.isEmpty()) {
            builder
                    .append(map.get(SC_G_DESC_SS))
                    .append(gameDescription)
                    .append(map.get(SC_G_DESC_FS))
                    .append(map.get(SC_G_DESC_SE));
        }
        return builder.toString();
    }

    private String getMenu() {
        final String menu = game.getInfo().getMenu();
        final StringBuilder builder = new StringBuilder(map.get(SC_MENU_SS));
        if (!menu.isEmpty()) {
            builder
                    .append(menu);
        } else {
            builder
                    .append(map.get(SC_MENU_DE));
        }
        builder
                .append(map.get(SC_MENU_FS))
                .append(map.get(SC_MENU_SE));
        return builder.toString();
    }

    protected String getStartConsole() {
        return getGameHead() +
                getGameName() +
                getGameDescription() +
                getMenu();
    }
}
