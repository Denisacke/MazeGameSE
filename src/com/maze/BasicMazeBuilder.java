package com.maze;

import java.util.Random;

public class BasicMazeBuilder implements MazeBuilder{

    private Maze maze;

    @Override
    public void buildMaze() {
        maze = new Maze();
    }

    @Override
    public void buildRoom(int num) {
        if(maze.getRoomInfo(num).equalsIgnoreCase("No room found")){
            Room room = new Room(num);
            maze.addRoom(room);

            room.setSide(Sides.NORTH, new Wall());
            room.setSide(Sides.EAST, new Wall());
            room.setSide(Sides.SOUTH, new Wall());
            room.setSide(Sides.WEST, new Wall());
        }
    }

    public Sides getOppositeSide(Sides side){
        if(side.equals(Sides.NORTH)){
            return Sides.SOUTH;
        }
        if(side.equals(Sides.SOUTH)){
            return Sides.NORTH;
        }
        if(side.equals(Sides.EAST)){
            return Sides.WEST;
        }
        if(side.equals(Sides.WEST)){
            return Sides.EAST;
        }
        return null;
    }
    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room room1 = maze.roomNo(roomFrom);
        Room room2 = maze.roomNo(roomTo);
        Door d = new Door(room1, room2);

        Random random = new Random();
        Sides[] sides = Sides.values();
        boolean foundSpace = false;
        while(!foundSpace){
            int pos = random.nextInt(4);
            if(room1.getSide(sides[pos]).getClass() == Wall.class && room2.getSide(getOppositeSide(sides[pos])).getClass() == Wall.class){
                maze.roomNo(roomFrom).setSide(sides[pos], d);
                maze.roomNo(roomTo).setSide(getOppositeSide(sides[pos]), d);
                foundSpace = true;
            }
        }
    }

    @Override
    public Maze getMaze() {
        return maze;
    }
}
