package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void calculateSum() {

        int num[] = {1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(num);
        int expectedResult = 6;
        assertEquals(expectedResult,result);

    }
}