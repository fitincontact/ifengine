package org.fitin.ifengine.service;

import com.google.inject.Singleton;
import org.fitin.ifengine.api.IFEngine;
import org.fitin.ifengine.model.*;

import static org.fitin.ifengine.config.InjectorProvider.getInstance;
import static org.fitin.ifengine.model.Game.GAME;

@Singleton
public class IFEngineImpl implements IFEngine {
    private final MainService mainService = getInstance(MainService.class);
    private final Info info = new Info();

    @Override
    public void setGameName(String gameName) {
        info.setGameName(gameName);
    }

    @Override
    public void setGameDescription(String gameDescription) {
        info.setGameDescription(gameDescription);
    }

    @Override
    public void setMenu(String menu) {
        info.setMenu(menu);
    }

    @Override
    public Player getPlayer(String word) {
        Player player = new Player(word);
        GAME.add(player);
        return player;
    }

    @Override
    public Room getRoom(String word) {
        return null;
    }

    @Override
    public Door getDoor(String word) {
        return null;
    }

    @Override
    public Item getItem(String word) {
        return null;
    }

    @Override
    public Dialog getDialog(String word) {
        return null;
    }

    @Override
    public Cutscene getCutscene(String word) {
        return null;
    }

    @Override
    public void start() {
        mainService.start(info);
    }
}
