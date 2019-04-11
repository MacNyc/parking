package com.testTech.wcg.Parking;

import com.testTech.wcg.MoveDirection;

public class ParkingMoves {

    public static final String VALID_INSTRUCTIONS = "FRL";

    private int side_x;
    private int sidy_y;

    private int startX;
    private int startY;

    private MoveDirection direction;

    private String moves;

    private int newX;
    private int newY;

    public ParkingMoves(String startXY, String moves, MoveDirection direction, int side_x, int sidy_y){
        this.side_x = side_x;
        this.sidy_y = sidy_y;
        this.setStartPosition(startXY);
        this.setMoves(moves);
        this.newX = startX;
        this.newY = startY;
        this.direction = direction;
    }

    public void showNewPosition(){
        for (int i = 0; i < moves.length(); i++){
            char c = moves.charAt(i);

            switch (c){
                case 'F': moveForward(); break;
                case 'R': setDirection(direction.turnRight());break;
                case 'L': setDirection(direction.turnLeft());break;
            }
        }
    }

    public int getStartX(){
        return startX;
    }

    public void setStartX(int startX){
        this.startX = startX;
    }

    public int getStartY(){
        return startY;
    }

    public void setStartY(int startY){
        this.startY = startY;
    }

    public String getMoves(){
        return moves;
    }

    public void setMoves(String moves){
        if(validMoves(moves))
        this.moves = moves;
    }

    public String getNewPosition(){
        return toPosition(startX, startY);
    }

    public String getStartPosition(){
        return toPosition(newX, newY);
    }

    public MoveDirection getDirection(){
        return direction;
    }

    public void setDirection(MoveDirection direction){
        this.direction = direction;
    }

    private String toPosition(int y, int x){
        return new StringBuffer()
                .append(y)
                .append(",")
                .append(x)
                .toString();
    }

    private void setStartPosition(String startXY){
        String cp [] = startXY.split(",");
        this.setStartX(Integer.valueOf(cp[0]));
        this.setStartY(Integer.valueOf(cp[1]));
    }

    public void moveForward(){
        switch (direction){
            case NORTH: startY++;break;
            case SOUTH: startY--;break;
            case WEST: startX--;break;
            case EAST: startX++;break;
        }
    }

    private boolean validMoves(String move){
        return move.chars()
                .mapToObj(c -> (char) c)
                .allMatch(c -> VALID_INSTRUCTIONS.contains(String.valueOf(c)));
    }

}
