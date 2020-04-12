package com;

import com.Player;
import java.util.List;

public class Team {
    private String region;
    private String name;
    private String Franchise;
    private String owner;
    private List<Player> players;

    public Team(String region, String name, String franchise, String owner) {
        this.region = region;
        this.name = name;
        Franchise = franchise;
        this.owner = owner;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFranchise() {
        return Franchise;
    }

    public void setFranchise(String franchise) {
        Franchise = franchise;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "com.Team{" +
                "region='" + region + '\'' +
                ", name='" + name + '\'' +
                ", Franchise='" + Franchise + '\'' +
                ", owner='" + owner + '\'' +
                ", players=" + players
                +
                '}';
    }
}
