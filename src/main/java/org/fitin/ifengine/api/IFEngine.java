package org.fitin.ifengine.api;

import org.fitin.ifengine.model.*;


public interface IFEngine {
    void setGameName(String gameName);

    void setGameDescription(String gameDescription);

    void setMenu(String menu);

    Player getPlayer(String word);

    Room getRoom(String word);

    Door getDoor(String word);

    Item getItem(String word);

    Dialog getDialog(String word);

    Cutscene getCutscene(String word);

    void start();
}
