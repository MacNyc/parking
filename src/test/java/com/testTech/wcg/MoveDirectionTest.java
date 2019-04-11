package com.testTech.wcg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoveDirectionTest {

    @Test
    public void turnRightTest(){
        MoveDirection moveDirection = MoveDirection.NORTH;
        MoveDirection newMoveDirection = moveDirection.turnRight();
        assertEquals(MoveDirection.EAST, newMoveDirection);

        moveDirection = MoveDirection.SOUTH;
        newMoveDirection = moveDirection.turnRight();
        assertEquals(MoveDirection.WEST, newMoveDirection);

        moveDirection = MoveDirection.WEST;
        newMoveDirection = moveDirection.turnRight();
        assertEquals(MoveDirection.NORTH, newMoveDirection);

        moveDirection = MoveDirection.EAST;
        newMoveDirection = moveDirection.turnRight();
        assertEquals(MoveDirection.SOUTH, newMoveDirection);
    }

    @Test
    public void turnLeftTest(){
        MoveDirection moveDirection = MoveDirection.NORTH;
        MoveDirection newMoveDirection = moveDirection.turnLeft();
        assertEquals(MoveDirection.WEST, newMoveDirection);

        moveDirection = MoveDirection.SOUTH;
        newMoveDirection = moveDirection.turnLeft();
        assertEquals(MoveDirection.EAST, newMoveDirection);

        moveDirection = MoveDirection.WEST;
        newMoveDirection = moveDirection.turnLeft();
        assertEquals(MoveDirection.SOUTH, newMoveDirection);

        moveDirection = MoveDirection.EAST;
        newMoveDirection = moveDirection.turnLeft();
        assertEquals(MoveDirection.NORTH, newMoveDirection);
    }
}
