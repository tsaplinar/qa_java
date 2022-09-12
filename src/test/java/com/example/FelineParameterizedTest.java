package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int methodParam;
    private final int expectedResult;

    public FelineParameterizedTest(int methodParam, int expectedResult) {
        this.methodParam = methodParam;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {1,1},
                {0,0},
                {-1,-1}, //kek
        };
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(methodParam);
        assertEquals(expectedResult,actualResult);
    }
}