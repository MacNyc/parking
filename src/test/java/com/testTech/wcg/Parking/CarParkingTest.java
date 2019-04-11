package com.testTech.wcg.Parking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarParkingTest {

    @Autowired
    private CarParking carParking;

    @Test
    public void carFollowsPath1(){
        ParkingMoves pm = carParking.carPosition("5,5:RFLFRFLF");

        assertEquals("5,5", pm.getStartPosition());
        assertEquals("RFLFRFLF", pm.getMoves());
        assertEquals("7,7", pm.getNewPosition());
    }

    @Test
    public void carFollowsPath2(){
        ParkingMoves pm = carParking.carPosition("6,6:FFLFFLFFLFF");

        assertEquals(("6,6"), pm.getStartPosition());
        assertEquals("FFLFFLFFLFF", pm.getMoves());
        assertEquals(("6,6"), pm.getNewPosition());
    }

    @Test
    public void carFollowsPath3(){
        ParkingMoves pm = carParking.carPosition("5,5:FLFLFFRFFF");

        assertEquals(("5,5"), pm.getStartPosition());
        assertEquals("FLFLFFRFFF", pm.getMoves());
        assertEquals(("4,1"), pm.getNewPosition());
    }

}
