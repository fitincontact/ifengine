package org.fitin.ifengine.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.fitin.ifengine.api.IFEngine;
import org.fitin.ifengine.model.*;

@Singleton
public class IFEngineImpl implements IFEngine {
    private final MainService mainService;
    private final Game game;

    @Inject
    public IFEngineImpl(MainService mainService,
                        Game game) {
        this.mainService = mainService;
        this.game = game;
    }

    @Override
    public Info getInfo() {
        return game.getInfo();
    }

    @Override
    public Player getPlayer(String word) {
        Player player = new Player(word);
        game.add(player);
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
        mainService.start();
    }
}
