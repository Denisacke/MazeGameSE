package com.maze;

public class Wall extends MapSite{

    @Override
    public void enter() {
        System.out.println("You just hit a wall!");
    }

    @Override
    public String getName() {
        return "Wall";
    }
}
