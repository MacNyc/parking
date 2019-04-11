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
        pm = new ParkingMoves("6,6","FFLFFLFFLFF", MoveDirection.NORTH, 15,15);
    }

    @Test
    public void showNewPositionTest(){
        pm.showNewPosition();

        assertEquals("6,6", pm.getStartPosition());
        assertEquals("6,6", pm.getNewPosition());
        assertEquals("FFLFFLFFLFF", pm.getMoves());
    }

    @Test
    public void moveForwardTest(){
        pm.setDirection(MoveDirection.NORTH);
        pm.moveForward();
        assertEquals("7,6", pm.getNewPosition());

        pm.setDirection(MoveDirection.SOUTH);
        pm.moveForward();
        assertEquals("6,6", pm.getNewPosition());

        pm.setDirection(MoveDirection.EAST);
        pm.moveForward();
        assertEquals("6,7", pm.getNewPosition());

        pm.setDirection(MoveDirection.WEST);
        pm.moveForward();
        assertEquals("6,6", pm.getNewPosition());

    }

}