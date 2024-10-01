package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testTwoIntegerObjectsValueAreTheSame(){
        Integer int1 = 999;
        Integer int2 = 999;
        assertEquals(int1, int2);
    }
}