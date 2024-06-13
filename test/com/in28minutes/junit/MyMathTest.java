package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {


    private MyMath math = new MyMath();
    @Test
    void calculateSum() {

        assertEquals(6, math.calculateSum(new int[]{1,2,3}));

    }

    @Test
    void NullTest() {

        assertEquals(0, math.calculateSum(new int[]{}));

    }
}