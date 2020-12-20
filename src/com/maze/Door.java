package com.maze;

public class Door extends MapSite{

    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2){
        this.room1 = room1;
        this.room2 = room2;
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void enter() {
        if(!isOpen){
            System.out.println("You cannot enter, since the door is closed");
        }else{
            System.out.println("You moved to another room");
        }
    }

    public void closeDoor(){
        if(isOpen){
            isOpen = false;
            System.out.println("Door between rooms " + room1.getName() + " and " + room2.getName() + " has been closed!");
        }else{
            System.out.println("The door is already closed!");
        }

    }

    public void openDoor(){
        if(!isOpen){
            isOpen = true;
            System.out.println("Door between rooms " + room1.getName() + " and " + room2.getName() + " is now open!");
        }else{
            System.out.println("The door is already open!");
        }

    }

    @Override
    public String getName() {
        return "Door";
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }


}
