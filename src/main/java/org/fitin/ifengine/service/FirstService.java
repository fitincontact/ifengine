package org.fitin.ifengine.service;

import com.google.inject.Singleton;
import org.fitin.ifengine.api.IFEngine;
import org.fitin.ifengine.model.Player;

import static org.fitin.ifengine.config.InjectorProvider.getInstance;

@Singleton
public class FirstService implements IFEngine {
    SecondService secondService = getInstance(SecondService.class);
    private Player player;

    @Override
    public Player getPlayer() {
        Player player1 = new Player();
        this.player = player1;
        return player1;
    }

    @Override
    public void start() {
        secondService.run(this.player);
    }
}
