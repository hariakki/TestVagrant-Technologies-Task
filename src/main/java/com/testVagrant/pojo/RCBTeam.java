package com.testVagrant.pojo;

import java.util.List;

public class RCBTeam {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<PlayerDetails> getPlayer() {
        return player;
    }

    public void setPlayer(List<PlayerDetails> player) {
        this.player = player;
    }

    private String name;
    private String location;
    private List<PlayerDetails> player;
}
