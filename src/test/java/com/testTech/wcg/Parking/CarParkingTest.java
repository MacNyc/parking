package com.testTech.wcg.Parking;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class CarParkingTest {

    @Autowired
    private CarParking carParking;

    @Test
    public void car1(){
        ParkingMoves pm = carParking.ParkCar("5,5:RFLFRFLF");

        assertEquals(("5,5"), pm.getStartPosition());
        assertEquals("RFLFRFLF", pm.getMoves());
        assertEquals(("7,7"), pm.getNewPosition());
    }

    @Test
    public void car2(){
        ParkingMoves pm = carParking.ParkCar("6,6:FFLFFLFFLFF");

        assertEquals(("6,6"), pm.getStartPosition());
        assertEquals("FFLFFLFFLFF", pm.getMoves());
        assertEquals(("6,6"), pm.getNewPosition());
    }

    @Test
    public void car3(){
        ParkingMoves pm = carParking.ParkCar("5,5:FLFLFFRFFF");

        assertEquals(("5,5"), pm.getStartPosition());
        assertEquals("FLFLFFRFFF", pm.getMoves());
        assertEquals(("4,1"), pm.getNewPosition());
    }

}
