package org.fitin.ifengine.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Game {
    public final static Game GAME = new Game();
    private final List<Cutscene> cutscenes;
    private final List<Dialog> dialogs;
    private final List<Door> doors;
    private final List<Item> items;
    private final List<Player> players;
    private final List<Room> rooms;
    @Setter
    private Info info;
    private Game() {
        cutscenes = new ArrayList<>();
        dialogs = new ArrayList<>();
        doors = new ArrayList<>();
        items = new ArrayList<>();
        players = new ArrayList<>();
        rooms = new ArrayList<>();
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
