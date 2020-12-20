package com.maze;

import java.util.Hashtable;

public class Room extends MapSite{

    private Hashtable<Sides, MapSite> sides;
    private int roomNo;

    public Room(int roomNo){
        sides = new Hashtable<Sides, MapSite>(4);
        this.roomNo = roomNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public MapSite getSide(Sides side){
        return sides.get(side);
    }

    public void setSide(Sides side, MapSite mapSite){
        sides.put(side, mapSite);
    }

    @Override
    public void enter() {
        System.out.println("You've entered room " + roomNo);
    }

    @Override
    public String getName() {
        return "Room " + roomNo;
    }
}
