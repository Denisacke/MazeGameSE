package com.maze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Maze maze = new Maze();
        MazeGame game = new MazeGame();
        BasicMazeBuilder builder = new BasicMazeBuilder();

        game.createMaze(builder);
        maze = builder.getMaze();
        System.out.println(maze.getRoomInfo(1));
        int currentRoom = 1;
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        while(!command.equals("quit")){
            if(command.equalsIgnoreCase("NORTH")){
                maze.roomNo(currentRoom).getSide(Sides.NORTH).enter();
                if(maze.roomNo(currentRoom).getSide(Sides.NORTH).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.NORTH);
                    if(door.isOpen()){
                        if(door.getRoom1().getRoomNo() == currentRoom){
                            currentRoom = door.getRoom2().getRoomNo();
                        }else{
                            currentRoom = door.getRoom1().getRoomNo();
                        }
                    }
                }

            }
            if(command.equalsIgnoreCase("EAST")){
                maze.roomNo(currentRoom).getSide(Sides.EAST).enter();
                if(maze.roomNo(currentRoom).getSide(Sides.EAST).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.EAST);
                    if(door.isOpen()){
                        if(door.getRoom1().getRoomNo() == currentRoom){
                            currentRoom = door.getRoom2().getRoomNo();
                        }else{
                            currentRoom = door.getRoom1().getRoomNo();
                        }
                    }
                }

            }
            if(command.equalsIgnoreCase("SOUTH")){
                maze.roomNo(currentRoom).getSide(Sides.SOUTH).enter();
                if(maze.roomNo(currentRoom).getSide(Sides.SOUTH).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.SOUTH);
                    if(door.isOpen()){
                        if(door.getRoom1().getRoomNo() == currentRoom){
                            currentRoom = door.getRoom2().getRoomNo();
                        }else{
                            currentRoom = door.getRoom1().getRoomNo();
                        }
                    }
                }

            }
            if(command.equalsIgnoreCase("WEST")){
                maze.roomNo(currentRoom).getSide(Sides.WEST).enter();
                if(maze.roomNo(currentRoom).getSide(Sides.WEST).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.WEST);
                    if(door.isOpen()){
                        if(door.getRoom1().getRoomNo() == currentRoom){
                            currentRoom = door.getRoom2().getRoomNo();
                        }else{
                            currentRoom = door.getRoom1().getRoomNo();
                        }
                    }
                }

            }
            if(command.equalsIgnoreCase("NOpen")){

                if(maze.roomNo(currentRoom).getSide(Sides.NORTH).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.NORTH);
                    door.openDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.NORTH).enter();
                }
            }
            if(command.equalsIgnoreCase("EOpen")){

                if(maze.roomNo(currentRoom).getSide(Sides.EAST).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.EAST);
                    door.openDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.EAST).enter();
                }
            }
            if(command.equalsIgnoreCase("SOpen")){

                if(maze.roomNo(currentRoom).getSide(Sides.SOUTH).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.SOUTH);
                    door.openDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.SOUTH).enter();
                }
            }
            if(command.equalsIgnoreCase("WOpen")){

                if(maze.roomNo(currentRoom).getSide(Sides.WEST).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.WEST);
                    door.openDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.WEST).enter();
                }
            }
            if(command.equalsIgnoreCase("NClose")){

                if(maze.roomNo(currentRoom).getSide(Sides.NORTH).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.NORTH);
                    door.closeDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.NORTH).enter();
                }
            }
            if(command.equalsIgnoreCase("EClose")){

                if(maze.roomNo(currentRoom).getSide(Sides.EAST).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.EAST);
                    door.closeDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.EAST).enter();
                }
            }
            if(command.equalsIgnoreCase("SClose")){

                if(maze.roomNo(currentRoom).getSide(Sides.SOUTH).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.SOUTH);
                    door.closeDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.SOUTH).enter();
                }
            }
            if(command.equalsIgnoreCase("WClose")){

                if(maze.roomNo(currentRoom).getSide(Sides.WEST).getName().equalsIgnoreCase("Door")){
                    Door door = (Door) maze.roomNo(currentRoom).getSide(Sides.WEST);
                    door.closeDoor();
                }else{
                    maze.roomNo(currentRoom).getSide(Sides.WEST).enter();
                }
            }
            if(command.equalsIgnoreCase("Info")){
                System.out.println(maze.getRoomInfo(currentRoom));
            }
            command = input.nextLine();
        }
    }
}
