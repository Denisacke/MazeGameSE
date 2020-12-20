package com.maze;

public interface MazeBuilder {

    public void buildMaze();
    public void buildRoom(int roomNo);
    public void buildDoor(int roomFrom, int roomTo);
    public Maze getMaze();


}
