package com.testTech.wcg.Parking;

import static org.junit.Assert.assertEquals;

import com.testTech.wcg.MoveDirection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingMovesTest {

    private ParkingMoves pm;

    @Before
    public void dataCar3(){
        pm = new ParkingMoves("5,5","RFLFRFLF", MoveDirection.NORTH, 14,14);
    }

    @Test
    public void showNewPositionTest(){
        pm.showNewPosition();

        assertEquals("(5,5)", pm.getStartPosition());
        assertEquals("(5,5)", pm.getNewPosition());
        assertEquals("RFLFRFLF", pm.getMoves());
    }

    @Test
    public void moveForwardTest(){
        pm.setDirection(MoveDirection.NORTH);
        pm.moveForward();
        assertEquals("(6,5)", pm.getNewPosition());

    }

}