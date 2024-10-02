package org.fitin.ifengine.model;

import lombok.Getter;

@Getter
public class Info {
    private String gameHead = "";
    private String gameName = "";
    private String gameDescription = "";
    //todo set default
    private String menu = "";

    public Info setGameHead(String gameHead) {
        this.gameHead = gameHead;
        return this;
    }

    public Info setGameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    public Info setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
        return this;
    }

    public Info setMenu(String menu) {
        this.menu = menu;
        return this;
    }
}
