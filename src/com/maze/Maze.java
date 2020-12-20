package com.maze;

import java.util.ArrayList;

public class Maze {

    private ArrayList<Room> rooms;

    public Maze(){
        rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public String getRoomInfo(int number){
        int pos = -1;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).getRoomNo() == number){
                pos = i;
                break;
            }
        }

        if(pos == -1){
            return "No room found";
        }
        sb.append("This is room " + rooms.get(pos).getRoomNo() + "\n");
        sb.append("To the North, there is a " + rooms.get(pos).getSide(Sides.NORTH).getName() + "\n");
        sb.append("To the East, there is a " + rooms.get(pos).getSide(Sides.EAST).getName() + "\n");
        sb.append("To the South, there is a " + rooms.get(pos).getSide(Sides.SOUTH).getName() + "\n");
        sb.append("To the West, there is a " + rooms.get(pos).getSide(Sides.WEST).getName() + "\n");
        return sb.toString();
    }

    public Room roomNo(int number){
        int pos = -1;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).getRoomNo() == number){
                pos = i;
                break;
            }
        }

        if(pos == -1){
            return null;
        }

        return rooms.get(pos);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
