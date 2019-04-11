package com.testTech.wcg.Parking;

import com.testTech.wcg.MoveDirection;
import org.springframework.stereotype.Component;

@Component
public class CarParking {

    public static final int SIDE_X = 14;
    public static final int SIDE_Y = 14;

    public ParkingMoves parkCar(String moves){
        ParkingMoves pm;

        pm = parkCar(moves);
        pm.showNewPosition();

        return pm;
    }

    private ParkingMoves createParkingMoves(String args){
        ParkingMoves pm = null;

        String parts[] = args.split(":");
        String startXY = parts [0];
        String moves = parts [1];

        pm = new ParkingMoves(startXY, moves, MoveDirection.NORTH, SIDE_X, SIDE_Y);
        return pm;

    }
}