package com.testTech.wcg.Parking;

import com.testTech.wcg.MoveDirection;

public class ParkingMoves {

    private int side_x;
    private int sidy_y;

    private int start_x;
    private int start_y;

    private MoveDirection direction;

    private String moves;

    private int new_x;
    private int new_y;

    public ParkingMoves(String startXY, String moves, MoveDirection direction, int side_x, int sidy_y){
        this.side_x = side_x;
        this.sidy_y = sidy_y;
        this.setStartPosition(startXY);
        this.setMoves(moves);
        this.new_x = start_x;
        this.new_y = start_y;
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

    public int getStart_x(){
        return start_x;
    }

    public void setStart_x(int start_x){
        this.start_x = start_x;
    }

    public int getStart_y(){
        return start_y;
    }

    public void setStart_y(int start_y){
        this.start_y = start_y;
    }

    public String getMoves(){
        return moves;
    }

    public void setMoves(String moves){
        this.moves = moves;
    }

    public String getStartPosition(){
        return toPosition(start_y, start_x);
    }

    public String getNewPosition(){
        return toPosition(new_y, new_x);
    }

    public MoveDirection getDirection(){
        return direction;
    }

    public void setDirection(MoveDirection direction){
        this.direction = direction;
    }

    private String toPosition(int y, int x){
        return new StringBuffer()
                .append("(")
                .append(y)
                .append(",")
                .append(x)
                .append(")")
                .toString();
    }

    private void setStartPosition(String startXY){
        String cp [] = startXY.split(",");
        this.setStart_x(Integer.valueOf(cp[0]));
        this.setStart_y(Integer.valueOf(cp[1]));
    }

    public void moveForward(){
        switch (direction){
            case NORTH: start_y++;break;
            case SOUTH: start_y--;break;
            case WEST: start_x--;break;
            case EAST: start_x++;break;
        }
    }

}
