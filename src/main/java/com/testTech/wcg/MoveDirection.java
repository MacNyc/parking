package com.testTech.wcg;

public enum MoveDirection {

    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private String point;

    MoveDirection(String point){
        this.point = point;
    }

    public String toString(){
        return point;
    }

    public MoveDirection turnRight(){
        switch (this){
            case NORTH: return MoveDirection.EAST;
            case EAST: return MoveDirection.SOUTH;
            case SOUTH: return MoveDirection.WEST;
            default: return MoveDirection.NORTH;
        }
    }

    public MoveDirection turnLeft(){
        switch (this){
            case NORTH: return MoveDirection.WEST;
            case WEST: return MoveDirection.SOUTH;
            case SOUTH: return MoveDirection.EAST;
            default: return MoveDirection.NORTH;
        }
    }
}
