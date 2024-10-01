package org.fitin.ifengine.model;

import lombok.Data;

@Data
public class Player {
    //name,description,room,items
    private String word;

    public Player(String word) {
        this.word = word;
    }

    public Player addDialog() {
        return this;
    }

}
