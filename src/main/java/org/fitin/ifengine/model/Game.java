package org.fitin.ifengine.model;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Singleton
public class Game {
    private final Info info = new Info();
    private final List<Cutscene> cutscenes = new ArrayList<>();
    private final List<Dialog> dialogs = new ArrayList<>();
    private final List<Door> doors = new ArrayList<>();
    private final List<Item> items = new ArrayList<>();
    private final List<Player> players = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    @Inject
    public Game() {
    }

    public void add(Cutscene cutscene) {
        cutscenes.add(cutscene);
    }

    public void add(Dialog dialog) {
        dialogs.add(dialog);
    }

    public void add(Door door) {
        doors.add(door);
    }

    public void add(Item item) {
        items.add(item);
    }

    public void add(Player player) {
        players.add(player);
    }

    public void add(Room room) {
        rooms.add(room);
    }

}
